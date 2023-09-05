package com.auth.user.management.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:captcha.properties")
@Data
public class CaptchaConfig {

	@Value("${captcha.enable}")
	private Boolean captchaEnable;
	
	@Value("${captcha.expire.in.second}")
	private int captchaExpireInSecond;
	
	@Value("${captcha.encryption.key}")
	private String captchaEncryptionKey;
	
	@Value("${captcha.length}")
	private int captchaLength;
	
	@Value("${captcha.only.with.upper.letter}")
	private Boolean captchaOnlyWithUpperLetter;
	
	@Value("${captcha.only.with.lower.letter}")
	private Boolean captchaOnlyWithLowerLetter;
	
	@Value("${captcha.only.with.both.letter}")
	private Boolean captchaOnlyWithBothLetter;
	
	@Value("${captcha.with.alphanumeric}")
	private Boolean captchaWithAlphanumeric;
	
	@Value("${captcha.with.lower.and.number}")
	private Boolean captchaWithLowerAndNumber;
	
	@Value("${captcha.with.upper.and.number}")
	private Boolean captchaWithUpperAndNumber;
	
	@Value("${captcha.with.alphanumeric.and.special}")
	private Boolean captchaWithAlphanumericAndSpecial;
}
