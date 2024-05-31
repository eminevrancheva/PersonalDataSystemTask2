package entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

public class PersonDto {
        @NotNull
        private String firstName;
        private String middleName;
        @NotNull
        private String lastName;
        @NotNull
        @Size(min = 10,max = 10)
        private Long personalNumber;
        @NotNull
        private String nationality;
        @NotNull
        @Size(min = 9,max = 9)
        private Long documentNumber;
        @DateTimeFormat
        private String birthday;
        @DateTimeFormat
        private String expiryDate;
        @DateTimeFormat
        private String birthplace;
        private String address;
        @Size
        private Integer height;
        private String eyesColor;

        private String authority;
        @DateTimeFormat
        private String issueDate;



        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Long getPersonalNumber() {
            return personalNumber;
        }

        public void setPersonalNumber(Long personalNumber) {
            this.personalNumber = personalNumber;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public Long getDocumentNumber() {
            return documentNumber;
        }

        public void setDocumentNumber(Long documentNumber) {
            this.documentNumber = documentNumber;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getBirthplace() {
            return birthplace;
        }

        public void setBirthplace(String birthplace) {
            this.birthplace = birthplace;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getEyesColor() {
            return eyesColor;
        }

        public void setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
        }

        public String getAuthority() {
            return authority;
        }

        public void setAuthority(String authority) {
            this.authority = authority;
        }

        public String getIssueDate() {
            return issueDate;
        }

        public void setIssueDate(String issueDate) {
            this.issueDate = issueDate;
        }



}
