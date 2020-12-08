package edu.lits.UserArrayFile;

public class User {
        public User() {
        }

        int numberUser;
        String nameUser;
        String passwordUser;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (numberUser != user.numberUser) return false;
            if (nameUser != null ? !nameUser.equals(user.nameUser) : user.nameUser != null) return false;
            return passwordUser != null ? passwordUser.equals(user.passwordUser) : user.passwordUser == null;
        }

        @Override
        public int hashCode() {
            int result = numberUser;
            result = 31 * result + (nameUser != null ? nameUser.hashCode() : 0);
            result = 31 * result + (passwordUser != null ? passwordUser.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "User{" +
                    "numberUser=" + numberUser +
                    ", nameUser='" + nameUser + '\'' +
                    ", passwordUser='" + passwordUser + '\'' +
                    '}';
        }

        public int getNumberUser() {
            return numberUser;
        }

        public void setNumberUser(int numberUser) {
            this.numberUser = numberUser;
        }

        public String getNameUser() {
            return nameUser;
        }

        public void setNameUser(String nameUser) {
            this.nameUser = nameUser;
        }

        public String getPasswordUser() {
            return passwordUser;
        }

        public void setPasswordUser(String passwordUser) {
            this.passwordUser = passwordUser;
        }
    }

