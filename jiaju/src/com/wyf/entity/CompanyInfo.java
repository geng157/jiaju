package com.wyf.entity;

public class CompanyInfo {
		private String companyIntroduction;
		private String corporateCulture;
		private String companyPhone;
		private String companyEmail;
		private String companyAddress;
		public String getCompanyIntroduction() {
			return companyIntroduction;
		}
		public void setCompanyIntroduction(String companyIntroduction) {
			this.companyIntroduction = companyIntroduction;
		}
		public String getCorporateCulture() {
			return corporateCulture;
		}
		public void setCorporateCulture(String corporateCulture) {
			this.corporateCulture = corporateCulture;
		}
		public String getCompanyPhone() {
			return companyPhone;
		}
		public void setCompanyPhone(String companyPhone) {
			this.companyPhone = companyPhone;
		}
		public String getCompanyEmail() {
			return companyEmail;
		}
		public void setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
		}
		public String getCompanyAddress() {
			return companyAddress;
		}
		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}
		public CompanyInfo(String companyIntroduction, String corporateCulture,
				String companyPhone, String companyEmail, String companyAddress) {
			super();
			this.companyIntroduction = companyIntroduction;
			this.corporateCulture = corporateCulture;
			this.companyPhone = companyPhone;
			this.companyEmail = companyEmail;
			this.companyAddress = companyAddress;
		}
		public CompanyInfo() {
			super();
		}
		@Override
		public String toString() {
			return "CompanyInfo [companyIntroduction=" + companyIntroduction
					+ ", corporateCulture=" + corporateCulture
					+ ", companyPhone=" + companyPhone + ", companyEmail="
					+ companyEmail + ", companyAddress=" + companyAddress + "]";
		}
		
}
