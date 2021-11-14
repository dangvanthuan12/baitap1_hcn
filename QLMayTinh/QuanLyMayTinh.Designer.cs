namespace QLMayTinh
{
    partial class QuanLyMayTinh
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(QuanLyMayTinh));
            this.label1 = new System.Windows.Forms.Label();
            this.dgvMT = new System.Windows.Forms.DataGridView();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.btnThoat = new System.Windows.Forms.Button();
            this.btnSua = new System.Windows.Forms.Button();
            this.btnLuu = new System.Windows.Forms.Button();
            this.btnThem = new System.Windows.Forms.Button();
            this.txtPhong = new System.Windows.Forms.TextBox();
            this.txtRoom = new System.Windows.Forms.Label();
            this.txtMornitor = new System.Windows.Forms.TextBox();
            this.lbMo = new System.Windows.Forms.Label();
            this.txtVga = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.txtRam = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtHarddisk = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtCPU = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtSomay = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btnThemPhong = new System.Windows.Forms.Button();
            this.imageList1 = new System.Windows.Forms.ImageList(this.components);
            this.tvwPhong = new System.Windows.Forms.TreeView();
            ((System.ComponentModel.ISupportInitialize)(this.dgvMT)).BeginInit();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(3, 1);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(152, 40);
            this.label1.TabIndex = 1;
            this.label1.Text = "Phòng Học";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // dgvMT
            // 
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.Red;
            dataGridViewCellStyle1.ForeColor = System.Drawing.Color.White;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.Blue;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.White;
            this.dgvMT.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle1;
            this.dgvMT.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvMT.Location = new System.Drawing.Point(6, 21);
            this.dgvMT.Name = "dgvMT";
            this.dgvMT.Size = new System.Drawing.Size(519, 165);
            this.dgvMT.TabIndex = 2;
            this.dgvMT.RowStateChanged += new System.Windows.Forms.DataGridViewRowStateChangedEventHandler(this.dgvMT_RowStateChanged);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.dgvMT);
            this.groupBox1.Location = new System.Drawing.Point(161, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(525, 193);
            this.groupBox1.TabIndex = 3;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Danh Sách Máy Tính";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.btnThoat);
            this.groupBox2.Controls.Add(this.btnSua);
            this.groupBox2.Controls.Add(this.btnLuu);
            this.groupBox2.Controls.Add(this.btnThem);
            this.groupBox2.Controls.Add(this.txtPhong);
            this.groupBox2.Controls.Add(this.txtRoom);
            this.groupBox2.Controls.Add(this.txtMornitor);
            this.groupBox2.Controls.Add(this.lbMo);
            this.groupBox2.Controls.Add(this.txtVga);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Controls.Add(this.txtRam);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Controls.Add(this.txtHarddisk);
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Controls.Add(this.txtCPU);
            this.groupBox2.Controls.Add(this.label3);
            this.groupBox2.Controls.Add(this.txtSomay);
            this.groupBox2.Controls.Add(this.label2);
            this.groupBox2.Location = new System.Drawing.Point(161, 211);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(525, 318);
            this.groupBox2.TabIndex = 0;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Thông Tin Chi Tiết";
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(419, 274);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(98, 23);
            this.btnThoat.TabIndex = 10;
            this.btnThoat.Text = "Thóat";
            this.btnThoat.UseVisualStyleBackColor = true;
            this.btnThoat.Click += new System.EventHandler(this.btnThoat_Click);
            // 
            // btnSua
            // 
            this.btnSua.Location = new System.Drawing.Point(287, 274);
            this.btnSua.Name = "btnSua";
            this.btnSua.Size = new System.Drawing.Size(98, 23);
            this.btnSua.TabIndex = 9;
            this.btnSua.Text = "Sửa";
            this.btnSua.UseVisualStyleBackColor = true;
            this.btnSua.Click += new System.EventHandler(this.btnSua_Click);
            // 
            // btnLuu
            // 
            this.btnLuu.Location = new System.Drawing.Point(155, 274);
            this.btnLuu.Name = "btnLuu";
            this.btnLuu.Size = new System.Drawing.Size(98, 23);
            this.btnLuu.TabIndex = 8;
            this.btnLuu.Text = "Lưu";
            this.btnLuu.UseVisualStyleBackColor = true;
            this.btnLuu.Click += new System.EventHandler(this.btnLuu_Click);
            // 
            // btnThem
            // 
            this.btnThem.Location = new System.Drawing.Point(23, 274);
            this.btnThem.Name = "btnThem";
            this.btnThem.Size = new System.Drawing.Size(98, 23);
            this.btnThem.TabIndex = 7;
            this.btnThem.Text = "Thêm";
            this.btnThem.UseVisualStyleBackColor = true;
            this.btnThem.Click += new System.EventHandler(this.btnThem_Click);
            // 
            // txtPhong
            // 
            this.txtPhong.Location = new System.Drawing.Point(87, 227);
            this.txtPhong.Name = "txtPhong";
            this.txtPhong.Size = new System.Drawing.Size(398, 20);
            this.txtPhong.TabIndex = 6;
            // 
            // txtRoom
            // 
            this.txtRoom.AutoSize = true;
            this.txtRoom.Location = new System.Drawing.Point(43, 230);
            this.txtRoom.Name = "txtRoom";
            this.txtRoom.Size = new System.Drawing.Size(38, 13);
            this.txtRoom.TabIndex = 0;
            this.txtRoom.Text = "Room:";
            // 
            // txtMornitor
            // 
            this.txtMornitor.Location = new System.Drawing.Point(87, 194);
            this.txtMornitor.Name = "txtMornitor";
            this.txtMornitor.Size = new System.Drawing.Size(398, 20);
            this.txtMornitor.TabIndex = 5;
            // 
            // lbMo
            // 
            this.lbMo.AutoSize = true;
            this.lbMo.Location = new System.Drawing.Point(36, 197);
            this.lbMo.Name = "lbMo";
            this.lbMo.Size = new System.Drawing.Size(45, 13);
            this.lbMo.TabIndex = 0;
            this.lbMo.Text = "Monitor:";
            // 
            // txtVga
            // 
            this.txtVga.Location = new System.Drawing.Point(87, 161);
            this.txtVga.Name = "txtVga";
            this.txtVga.Size = new System.Drawing.Size(398, 20);
            this.txtVga.TabIndex = 4;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(49, 164);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(32, 13);
            this.label6.TabIndex = 0;
            this.label6.Text = "VGA:";
            // 
            // txtRam
            // 
            this.txtRam.Location = new System.Drawing.Point(87, 128);
            this.txtRam.Name = "txtRam";
            this.txtRam.Size = new System.Drawing.Size(398, 20);
            this.txtRam.TabIndex = 3;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(47, 131);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(34, 13);
            this.label5.TabIndex = 0;
            this.label5.Text = "RAM:";
            // 
            // txtHarddisk
            // 
            this.txtHarddisk.Location = new System.Drawing.Point(87, 95);
            this.txtHarddisk.Name = "txtHarddisk";
            this.txtHarddisk.Size = new System.Drawing.Size(398, 20);
            this.txtHarddisk.TabIndex = 2;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(29, 98);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(52, 13);
            this.label4.TabIndex = 0;
            this.label4.Text = "Harddisk:";
            // 
            // txtCPU
            // 
            this.txtCPU.Location = new System.Drawing.Point(87, 62);
            this.txtCPU.Name = "txtCPU";
            this.txtCPU.Size = new System.Drawing.Size(398, 20);
            this.txtCPU.TabIndex = 1;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(49, 65);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(32, 13);
            this.label3.TabIndex = 0;
            this.label3.Text = "CPU:";
            // 
            // txtSomay
            // 
            this.txtSomay.Location = new System.Drawing.Point(87, 29);
            this.txtSomay.Name = "txtSomay";
            this.txtSomay.Size = new System.Drawing.Size(398, 20);
            this.txtSomay.TabIndex = 0;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(20, 32);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(61, 13);
            this.label2.TabIndex = 0;
            this.label2.Text = "Mã số máy:";
            // 
            // btnThemPhong
            // 
            this.btnThemPhong.Location = new System.Drawing.Point(23, 498);
            this.btnThemPhong.Name = "btnThemPhong";
            this.btnThemPhong.Size = new System.Drawing.Size(114, 23);
            this.btnThemPhong.TabIndex = 0;
            this.btnThemPhong.Text = "Thêm Phòng Học";
            this.btnThemPhong.UseVisualStyleBackColor = true;
            this.btnThemPhong.Click += new System.EventHandler(this.btnThemPhong_Click);
            // 
            // imageList1
            // 
            this.imageList1.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imageList1.ImageStream")));
            this.imageList1.TransparentColor = System.Drawing.Color.Transparent;
            this.imageList1.Images.SetKeyName(0, "Search_IMA.jpg");
            // 
            // tvwPhong
            // 
            this.tvwPhong.ImageIndex = 0;
            this.tvwPhong.ImageList = this.imageList1;
            this.tvwPhong.Location = new System.Drawing.Point(8, 44);
            this.tvwPhong.Name = "tvwPhong";
            this.tvwPhong.SelectedImageIndex = 0;
            this.tvwPhong.Size = new System.Drawing.Size(136, 448);
            this.tvwPhong.TabIndex = 5;
            this.tvwPhong.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this.tvwPhong_AfterSelect);
            // 
            // QuanLyMayTinh
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(686, 533);
            this.Controls.Add(this.tvwPhong);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnThemPhong);
            this.Name = "QuanLyMayTinh";
            this.Text = "QuanLyMayTinh";
            this.Load += new System.EventHandler(this.QuanLyMayTinh_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvMT)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView dgvMT;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Button btnThoat;
        private System.Windows.Forms.Button btnSua;
        private System.Windows.Forms.Button btnLuu;
        private System.Windows.Forms.Button btnThem;
        private System.Windows.Forms.TextBox txtPhong;
        private System.Windows.Forms.Label txtRoom;
        private System.Windows.Forms.TextBox txtMornitor;
        private System.Windows.Forms.Label lbMo;
        private System.Windows.Forms.TextBox txtVga;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox txtRam;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtHarddisk;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtCPU;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtSomay;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnThemPhong;
        private System.Windows.Forms.TreeView tvwPhong;
        private System.Windows.Forms.ImageList imageList1;
    }
}