using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace QLNhanVien.Entities
{
    public class NhanVienEntities
    {
        private string maNhanVien;

        public string MaNhanVien
        {
            get { return maNhanVien; }
            set { if (!String.IsNullOrEmpty(value)) maNhanVien = value; 
            else throw new Exception("Ma mon an khong de trong!"); }
        }
        private string tenNhanVien;

        public string TenNhanVien
        {
            get { return tenNhanVien; }
            set { tenNhanVien = value; }
        }
        private int tuoiNV;

        public int TuoiNV
        {
            get { return tuoiNV; }
            set { tuoiNV = value; }
        }


        private decimal luong;

        public decimal Luong
        {
            get { return luong; }
            set { luong = value; }
        }


        private string chucVu;

        public string ChucVu
        {
            get { return chucVu; }
            set { chucVu = value; }
        }


        private int maPhong;

        public int MaPhong
        {
            get { return maPhong; }
            set { maPhong = value; }
        }

       
        public NhanVienEntities() { }
        public NhanVienEntities(string maNV, string tenNV, int tuoiNV, 
            decimal luong, string chucVu, int maPhong)
        {
            MaNhanVien = maNV;
            TenNhanVien = tenNV;
            TuoiNV = tuoiNV;
            Luong = luong;
            ChucVu = chucVu;
            MaPhong = maPhong;
        }
    }
}
