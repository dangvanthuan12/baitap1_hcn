using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QLMayTinh
{
    public partial class QuanLyMayTinh : Form
    {
        SQLMTDataContext db;
        List<tblPhonghoc> dsPhong;
        List<tblMaytinh> dsMT;
        public QuanLyMayTinh()
        {
            InitializeComponent();
            loadtree();
            //loadGrid(dsMT);
        }
        private void loadtree()
        {
            try {
                tvwPhong.Nodes.Clear(); // Xoa het cac Node
                db = new SQLMTDataContext();
                dsPhong = new List<tblPhonghoc>();
                dsPhong = db.tblPhonghocs.ToList();
                foreach (var item in dsPhong)
                {
                    TreeNode n = new TreeNode();
                    n.Text = item.tenPhong;
                    n.Tag = item.msPhong;
                    tvwPhong.Nodes.Add(n);
                }
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnThemPhong_Click(object sender, EventArgs e)
        {
            Form1 f = new Form1();
            f.ShowDialog();
            loadtree();
        }

        private void tvwPhong_AfterSelect(object sender, TreeViewEventArgs e)
        {
            string maphong;
            if(e.Node.Level == 0)
            {
                //loadGrid(dsMT);
                db = new SQLMTDataContext();
                maphong = e.Node.Tag.ToString();
                dsMT = new List<tblMaytinh>();
                //dsMT = db.tblMaytinhs.Where(x => x.msPhong == maphong).ToList();     
                dsMT = (from x in db.tblMaytinhs
                        where x.msPhong == maphong
                        select x).ToList();
                txtPhong.Text = maphong;
                loadGrid(dsMT);
            }
        }
        private void loadGrid(List<tblMaytinh> l)
        {
            dgvMT.DataSource = l;
            formatDatafrid();
        }
        private void formatDatafrid()
        {
            if (dgvMT.Columns["tblPhonghoc"] != null)
                dgvMT.Columns["tblPhonghoc"].Visible = false;
            if (dgvMT.Columns["msPhong"] != null)
                dgvMT.Columns["msPhong"].Visible = false;
        }

        private void QuanLyMayTinh_Load(object sender, EventArgs e)
        {
            txtPhong.ReadOnly = true;
            btnLuu.Enabled = false;
            AnTextBox(false);
        }
        private void AnTextBox(bool k)
        {
            txtCPU.Enabled = k;
            txtHarddisk.Enabled = k;
            txtMornitor.Enabled = k;
            txtPhong.Enabled = k;
            txtRam.Enabled = k;
            txtSomay.Enabled = k;
            txtVga.Enabled = k;
        }
        private void dgvMT_RowStateChanged(object sender, DataGridViewRowStateChangedEventArgs e)
        {
            if (dgvMT.SelectedRows.Count > 0)
            {
                txtSomay.Text = e.Row.Cells["msMay"].Value.ToString();
                txtCPU.Text = e.Row.Cells["CPU"].Value.ToString();
                txtHarddisk.Text = e.Row.Cells["HardDisk"].Value.ToString();
                txtMornitor.Text = e.Row.Cells["Monitor"].Value.ToString();
                txtRam.Text = e.Row.Cells["RAM"].Value.ToString();
                txtVga.Text = e.Row.Cells["VGA"].Value.ToString();
            }
            else
            {
                XoaTextBox();
            }
        }
        private void XoaTextBox()
        {
            txtVga.Clear();
            txtSomay.Clear();
            txtRam.Clear();
            txtHarddisk.Clear();
            txtMornitor.Clear();
            txtCPU.Clear();
        }

        private void btnThem_Click(object sender, EventArgs e)
        {
            txtSomay.Focus();
            btnLuu.Enabled = true;
            XoaTextBox();
            AnTextBox(true);
        }

        private void btnLuu_Click(object sender, EventArgs e)
        {
            if (txtSomay.ReadOnly==false)
            {
                db = new SQLMTDataContext();
                try
                {
                    loadtree();
                    tblMaytinh t = new tblMaytinh();
                    t.CPU = txtCPU.Text;
                    t.HardDisk = txtHarddisk.Text;
                    t.Monitor = txtMornitor.Text;
                    t.msMay = txtSomay.Text;
                    t.VGA = txtVga.Text;
                    t.RAM = txtRam.Text;
                    t.msPhong = txtPhong.Text;

                    db.tblMaytinhs.InsertOnSubmit(t);
                    db.SubmitChanges();//Luu database
                    loadGrid(db.tblMaytinhs.Where(x => x.msPhong == txtPhong.Text).ToList());
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
            else
            {
                //nut sua
                db = new SQLMTDataContext();
                tblMaytinh t = db.tblMaytinhs.Where(x => x.msMay == txtSomay.Text).FirstOrDefault();
                t.CPU = txtCPU.Text;
                t.HardDisk = txtHarddisk.Text;
                t.Monitor = txtMornitor.Text;
                t.msPhong = txtPhong.Text;
                t.RAM = txtRam.Text;
                t.VGA = txtVga.Text;

                //db.tblMaytinhs.InsertOnSubmit(t);
                db.SubmitChanges();
                //loadtree();
                //loadGrid(dsMT);
            }
        }

        private void btnSua_Click(object sender, EventArgs e)
        {
            AnTextBox(true);
            txtSomay.ReadOnly = true;
            txtCPU.Focus();
            btnLuu.Enabled = true;
        }

        private void btnThoat_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
