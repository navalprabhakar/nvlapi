/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.rest;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.NoopHostnameVerifier;

/**
 * The Class SSLConfigurer.
 */
public final class SSLConfigurer {

	private static final TrustManager[] UNQUESTIONING_TRUST_MANAGER = new TrustManager[] { new X509TrustManager() {
		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public void checkClientTrusted(X509Certificate[] certs, String authType) {
		}

		public void checkServerTrusted(X509Certificate[] certs, String authType) {
		}
	} };

	/**
	 * Turn off ssl checking.
	 *
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws KeyManagementException the key management exception
	 */
	public static void turnOffSslChecking() throws NoSuchAlgorithmException, KeyManagementException {
		// Install the all-trusting trust manager
		final SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, UNQUESTIONING_TRUST_MANAGER, null);
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		HttpsURLConnection.setDefaultHostnameVerifier(new NoopHostnameVerifier());
	}

	/**
	 * Turn on ssl checking.
	 *
	 * @throws KeyManagementException the key management exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 */
	public static void turnOnSslChecking() throws KeyManagementException, NoSuchAlgorithmException {
		// Return it to the initial state (discovered by reflection, now hardcoded)
		SSLContext.getInstance("SSL").init(null, null, null);
	}

	private SSLConfigurer() {
		throw new UnsupportedOperationException("Do not instantiate libraries.");
	}

	void test() {
		int[] res = { 1, 2, -3, 0, 6 };
		try {
			Arrays.stream(res).forEach(item -> {
				if (item < 0) {
					throw new IllegalArgumentException("Couldn't delete the User List id: " + item);
				}
			});
		} catch (IllegalArgumentException e) {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}