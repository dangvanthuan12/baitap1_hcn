using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using QLNhanVien.Entities;

namespace QLMonAn.DataAccess
{
    public class NhanVienDAL
    {
        QLNVDataContext db;
        public NhanVienDAL()
        {
            db = new QLNVDataContext();
        }
        public List<NhanVienEntities> LayDanhSachMonAnTheoNhom(int maphong)
        {
            List<NhanVienEntities> lst = new List<NhanVienEntities>();
            db = new QLNVDataContext();
            foreach (var item in db.NhanViens.Where(x=>x.maPhong==maphong))
            {
                NhanVien n = new NhanVien();
                n.MaNhanVien = item.maNhanVien;
                n.TenPhong = item.tenPhong;
                n.DonViTinh = item.donViTinh;
                n.MaNhom =(int) item.maNhom;
                n.DonGia =(decimal) item.donGia;
                n.GhiChu = item.ghiChu;
                lst.Add(n);
            }
            return lst;
        }
        public bool ThemMonAn(NhanVienEntities m)
        {
            db = new QLNVDataContext();
            NhanVien q = db.NhanViens.Where(x => x.maNhanVien == m.MaNhanVien).FirstOrDefault();
            if (q != null) throw new Exception("Mon an da co!");
            else
            {
                NhanVien qnew = new NhanVien();
                qnew.maMonAn = m.MaMonAn;
                qnew.tenMonAn = m.TenMonAn;
                qnew.donGia = m.DonGia;
                qnew.donViTinh = m.DonViTinh;
                qnew.ghiChu = m.GhiChu;
                qnew.maNhom = m.MaNhom;
                db.MonAns.InsertOnSubmit(qnew);
                db.SubmitChanges();
                return true;
            }
            
        }
        public bool SuaMonAn(NhanVienEntities m)
        {
            db = new QLMADataContext();
            MonAn q = db.MonAns.Where(x => x.maMonAn == m.MaMonAn).FirstOrDefault();
            if (q != null)             
            {                
                q.maMonAn = m.MaMonAn;
                q.tenMonAn = m.TenMonAn;
                q.donGia = m.DonGia;
                q.donViTinh = m.DonViTinh;
                q.ghiChu = m.GhiChu;
                q.maNhom = m.MaNhom;               
                db.SubmitChanges();
                return true;
            }
            return false;
        }
    }
}
