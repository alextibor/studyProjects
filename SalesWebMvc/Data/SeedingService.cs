using SalesWebMvc.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SalesWebMvc.Data
{
    public class SeedingService
    {
        private SalesWebMvcContext _context;

        public SeedingService(SalesWebMvcContext context)
        {
            _context = context;
        }

        public void Seed()
        {
            if(_context.Department.Any() || 
               _context.Seller.Any() || 
               _context.SalesRecord.Any())
            {
                return; //Db has been seeded
            }

            Department d1 = new Department(1, "Computers");
            Department d2 = new Department(2, "Electronics");

            Seller s1 = new Seller(1, "Bob Brown", "bob@gmail.com", new DateTime(1998, 4, 21), 1000.0, d1);
            Seller s2 = new Seller(1, "Alex Brown", "xela@gmail.com", new DateTime(1994, 4, 21), 1000.0, d2);

            SalesRecord r1 = new SalesRecord(1, new DateTime(2020, 4, 30), 11000.0, SalesStatus.Billed, s1);

            _context.Department.AddRange(d1, d2);
            _context.Seller.AddRange(s1, s2);
            _context.SalesRecord.AddRange(r1);

            _context.SaveChanges();
        }
    }
}
