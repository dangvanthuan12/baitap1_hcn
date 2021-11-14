using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace QLMonAn.Entities
{
    public class PhongBanEntities
    {
        private int maPhong;
        private string tenPhong;

        public string TenPhong
        {
            get { return tenPhong; }
            set { tenPhong = value; }
        }
        public int MaPhong
        {
            get { return maPhong; }
            set { maPhong = value; }
        }
        public PhongBanEntities() { }
        public PhongBanEntities(int ma, string ten)
        {
            MaPhong = ma;
            TenPhong = ten;
        }
    }
}
