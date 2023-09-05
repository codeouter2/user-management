package com.auth.user.management.util;

import org.springframework.http.HttpHeaders;


public class ValidationHeaders {

	public static HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Frame-Options","sameorigin");
		headers.add("X-XSS-Protection","0");
		headers.add("X-Content-Type-Options","nosniff");
		headers.add("X-Download-options","noopen");
		headers.add("Referrer-Policy","same-origin");
		headers.add("Content-Security-Policy","script-src 'self'");
		headers.add("Strict-Transport-Security","max-age=31536000 ;" + "includeSubDomains");
		headers.add("Feature-Policy","microphone 'none';" + 
					"geolocation 'none';" + 
					"vibrate 'none';"+
					"xr-spatial-trackingExperimental 'none';"+
					"publickey-credentials-getExperimental 'none';" + 
					"legacy-image-formatsExperimental 'none';"+
					"picture-in-picture 'none'");
		return headers;
	}
}
