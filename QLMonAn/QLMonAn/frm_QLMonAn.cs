using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using QLMonAn.Entities;
using QLMonAn.DataAccess;

namespace QLMonAn
{
    public partial class frm_QLMonAn : Form
    {
        PhongBanDAL ndao;
        List<PhongBanEntities> dsNhom;
        List<NhanVienEntities> lstMA;
        NhanVienDAL madao;
        public frm_QLMonAn()
        {
            InitializeComponent();
            LoadTree();
            AnTextBoxMonAn(false);
            AnTextBoxNhomMonAn(false);
        }
        private void LoadTree()
        {
            ndao = new PhongBanDAL();
            dsNhom = new List<PhongBanEntities>();
            dsNhom = ndao.LayDanhSachNhom();
            treeView1.Nodes.Clear();
            foreach (var item in dsNhom)
            {
                TreeNode n = new TreeNode(item.TenNhom);
                n.Tag = item.MaNhom;
                treeView1.Nodes.Add(n);
               
            }
            treeView1.ExpandAll();
        }
        private void AnTextBoxMonAn(bool khoa)
        {
            txtMaMA.Enabled = khoa;
            txtTenMA.Enabled = khoa;
            txtDV.Enabled = khoa;
            txtDG.Enabled = khoa;
            txtGC.Enabled = khoa;
            btnLuu.Enabled = khoa;
        }
        private void AnTextBoxNhomMonAn(bool khoa)
        {
            txtMaNhom.Enabled = khoa;
            txtTenNhom.Enabled = khoa;
        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {
            madao=new NhanVienDAL();
            LoadDataGrid((int)e.Node.Tag);
            FormatGrid();
        }
        private void LoadDataGrid(int manhom)
        {
            lstMA = madao.LayDanhSachMonAnTheoNhom(manhom);
            dataGridView1.DataSource = lstMA;
        }
        private void FormatGrid()
        {
            if (dataGridView1.Columns["maMonAn"] != null)
                dataGridView1.Columns["maMonAn"].Visible = false;
            if (dataGridView1.Columns["tenMonAn"] != null)
            {
                dataGridView1.Columns["tenMonAn"].HeaderText = "Ten mon an";
                dataGridView1.Columns["tenMonAn"].Width = 200;
            }
            if (dataGridView1.Columns["donViTinh"] != null)
            {
                dataGridView1.Columns["donViTinh"].HeaderText = "Don Vi Tinh";
                dataGridView1.Columns["donViTinh"].Width = 150;
            }
            if (dataGridView1.Columns["donGia"] != null)
            {
                dataGridView1.Columns["donGia"].HeaderText = "Don gia";
                dataGridView1.Columns["donGia"].Width = 130;
            }
            if (dataGridView1.Columns["ghiChu"] != null)
            {
                dataGridView1.Columns["ghiChu"].HeaderText = "Ghi chu";
                dataGridView1.Columns["ghiChu"].Width = 220;
            }
            if (dataGridView1.Columns["maNhom"] != null)
                dataGridView1.Columns["maNhom"].Visible = false;

        }

        private void dataGridView1_RowStateChanged(object sender, 
            DataGridViewRowStateChangedEventArgs e)
        {
            if (dataGridView1.SelectedRows.Count > 0)
            {
                txtMaMA.Text = e.Row.Cells["maMonAn"].Value.ToString();
                txtTenMA.Text = e.Row.Cells["tenMonAn"].Value.ToString();
                txtDG.Text = e.Row.Cells["donGia"].Value.ToString();
                txtDV.Text = e.Row.Cells["donViTinh"].Value.ToString();
                txtGC.Text = e.Row.Cells["ghiChu"].Value.ToString();
            }
            else
            {
                XoaTextBox();
            }

        }
        private void XoaTextBox()
        {
            txtMaMA.ResetText();
            txtTenMA.Clear();
            txtDV.Text = "";
            txtGC.Clear();
            txtDG.Clear();

        }

        private void btnThem_Click(object sender, EventArgs e)
        {
            if (btnThem.Text == "&Nhập mới")
            {
                XoaTextBox();
                txtMaMA.Focus();
                AnTextBoxMonAn(true);
                btnThem.Text = "Bo qua";
            }
            else
            {
                AnTextBoxMonAn(false);
                btnThem.Text = "&Nhập mới";

            }
        }

        private void btnSua_Click(object sender, EventArgs e)
        {
            if (btnSua.Text == "&Sửa thông tin")
            { 
                AnTextBoxMonAn(true);
                txtTenMA.Focus();
                txtMaMA.Enabled = false;
                btnSua.Text = "Bo qua";
            }
            else
            {
                AnTextBoxMonAn(false);
                btnSua.Text = "&Sửa thông tin";
            }
        }

        private void btnLuu_Click(object sender, EventArgs e)
        {
            if (txtMaMA.Enabled)
            {
                //them
                try
                {
                    NhanVienEntities m = new NhanVienEntities(txtMaMA.Text, txtTenMA.Text, 
                        txtDV.Text, decimal.Parse(txtDG.Text), txtGC.Text, 
                        (int)treeView1.SelectedNode.Tag);
                    if (madao.ThemMonAn(m))
                    {
                        LoadDataGrid((int)treeView1.SelectedNode.Tag);
                        AnTextBoxMonAn(false);
                        btnThem.Text = "&Nhập mới";
                    }
                    else
                    {
                        MessageBox.Show("Khong them duoc!");
                        txtMaMA.Focus();
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
            else
            {
                //sua
                try
                {
                    NhanVienEntities m = new NhanVienEntities(txtMaMA.Text, txtTenMA.Text, 
                        txtDV.Text, decimal.Parse(txtDG.Text), txtGC.Text, 
                        (int)treeView1.SelectedNode.Tag);
                    if (madao.SuaMonAn(m))
                    {
                        LoadDataGrid((int)treeView1.SelectedNode.Tag);
                        AnTextBoxMonAn(false);
                        btnSua.Text = "&Sửa thông tin";
                    }
                    else
                    {
                        MessageBox.Show("Khong sua duoc!");
                        txtTenMA.Focus();
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

        private void btnThemNhom_Click(object sender, EventArgs e)
        {
            if (btnThemNhom.Text == "Thêm")
            {
                AnTextBoxNhomMonAn(true);
                txtMaNhom.Focus();
                btnThemNhom.Text = "Luu";
                txtMaNhom.Text = "";
                txtTenNhom.Text = "";
            }
            else
            {
                //luu
                try
                {
                    PhongBanEntities m = new PhongBanEntities(int.Parse(txtMaNhom.Text),
                        txtTenNhom.Text);
                    if (ndao.ThemNhom(m))
                    {
                        LoadTree();
                        AnTextBoxNhomMonAn(false);
                        btnThemNhom.Text = "Thêm";
                    }
                    else
                    {
                        MessageBox.Show("Khong them duoc!");
                        txtMaNhom.Focus();
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

        private void btnHuy_Click(object sender, EventArgs e)
        {
            btnThemNhom.Text = "Thêm";
            AnTextBoxNhomMonAn(false);
        }       
    }
}
