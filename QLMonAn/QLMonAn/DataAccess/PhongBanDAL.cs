using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using QLMonAn.Entities;
namespace QLMonAn.DataAccess
{
    public class PhongBanDAL
    {
        QLNVDataContext db;
        public PhongBanDAL()
        {
            db = new QLNVDataContext();
        }
        public List<PhongBanEntities> LayDanhSachNhom()
        {
            db=new QLNVDataContext();
            List<PhongBanEntities> lst = new List<PhongBanEntities>();
            var q = db.PhongBans.ToList();
            if (q.Count > 0)
            {
                foreach (var item in q)
                {
                    PhongBanEntities n = new PhongBanEntities();
                    n.MaPhong = item.maPhong;
                    n.TenPhong = item.tenPhong;
                    lst.Add(n);
                }
                return lst;
            }
            return null;
        }
        public bool ThemNhom(PhongBanEntities m)
        {
            db = new QLNVDataContext();
            PhongBan q = db.PhongBans.Where(
                x => x.maPhong == m.MaPhong).FirstOrDefault();
            if (q != null) throw new Exception("Mon an da co!");
            else
            {
                PhongBan qnew = new PhongBan();
                qnew.maPhong = m.MaPhong;
                qnew.tenPhong = m.TenPhong;
              
                db.PhongBans.InsertOnSubmit(qnew);
                db.SubmitChanges();
                return true;
            }

        }
    }
}
