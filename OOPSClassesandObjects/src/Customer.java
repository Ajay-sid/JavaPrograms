
    public class Customer{
        private String name;
        private int creditLimit;
        private String email;

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", creditLimit=" + creditLimit +
                    ", email='" + email + '\'' +
                    '}';
        }

        public Customer(String name, int creditLimit, String email){
            this.email=email;
            this.creditLimit=creditLimit;
            this.name=name;

        }
        public Customer(){
            this("NoOne","jfsljf.com");


        }
        public Customer(String name,String email){
            this(name,80000,email);

        }



        public String getName(){
            return name;
        }
        public int getCreditLimit(){
            return creditLimit;
        }
        public String getEmail(){
            return email;
        }






    }







