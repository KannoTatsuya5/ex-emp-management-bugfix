package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須項目です。")
	private String name;
	/** メールアドレス */
	@NotBlank(message = "メールアドレスは必須項目です。")
	@Email(message = "メールアドレス形式で記載してください。")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードは必須項目です。")
	@Pattern(regexp = "^[0-9a-zA-Z]+$", message = "パスワードは英数字の組み合わせで記載してください。")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
