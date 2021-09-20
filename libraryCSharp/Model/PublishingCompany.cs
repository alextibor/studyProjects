namespace libraryCSharp.Model
{
    public class PublishingCompany
    {
        public string name { get; set; }
        public int cpf { get; set; }
        public string email { get; set; }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}