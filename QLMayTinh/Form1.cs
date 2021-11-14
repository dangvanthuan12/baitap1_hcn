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
    public partial class Form1 : Form
    {
        SQLMTDataContext db;
        BindingSource bs;
        public Form1()
        {
            InitializeComponent();
            loadDataGrid();
        }
        private void loadDataGrid()
        {
            db = new SQLMTDataContext();
            bs = new BindingSource();
            bs.DataSource = db.tblPhonghocs;
            dataGrid1.DataSource = bs;
            bindingNavigator1.BindingSource = bs;
    }

        private void tlSave_Click(object sender, EventArgs e)
        {
            try {
                this.Validate();
                dataGrid1.EndEdit();
                bs.EndEdit();
                db.SubmitChanges();
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
