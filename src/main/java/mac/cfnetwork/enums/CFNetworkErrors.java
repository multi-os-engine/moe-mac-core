/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.cfnetwork.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CFNetworkErrors {
	@Generated
	private CFNetworkErrors() {
	}

	@Generated
	public static final int kCFHostErrorHostNotFound = 0x00000001;
	@Generated
	public static final int kCFHostErrorUnknown = 0x00000002;
	@Generated
	public static final int kCFSOCKSErrorUnknownClientVersion = 0x00000064;
	@Generated
	public static final int kCFSOCKSErrorUnsupportedServerVersion = 0x00000065;
	@Generated
	public static final int kCFSOCKS4ErrorRequestFailed = 0x0000006E;
	@Generated
	public static final int kCFSOCKS4ErrorIdentdFailed = 0x0000006F;
	@Generated
	public static final int kCFSOCKS4ErrorIdConflict = 0x00000070;
	@Generated
	public static final int kCFSOCKS4ErrorUnknownStatusCode = 0x00000071;
	@Generated
	public static final int kCFSOCKS5ErrorBadState = 0x00000078;
	@Generated
	public static final int kCFSOCKS5ErrorBadResponseAddr = 0x00000079;
	@Generated
	public static final int kCFSOCKS5ErrorBadCredentials = 0x0000007A;
	@Generated
	public static final int kCFSOCKS5ErrorUnsupportedNegotiationMethod = 0x0000007B;
	@Generated
	public static final int kCFSOCKS5ErrorNoAcceptableMethod = 0x0000007C;
	@Generated
	public static final int kCFFTPErrorUnexpectedStatusCode = 0x000000C8;
	@Generated
	public static final int kCFErrorHTTPAuthenticationTypeUnsupported = 0x0000012C;
	@Generated
	public static final int kCFErrorHTTPBadCredentials = 0x0000012D;
	@Generated
	public static final int kCFErrorHTTPConnectionLost = 0x0000012E;
	@Generated
	public static final int kCFErrorHTTPParseFailure = 0x0000012F;
	@Generated
	public static final int kCFErrorHTTPRedirectionLoopDetected = 0x00000130;
	@Generated
	public static final int kCFErrorHTTPBadURL = 0x00000131;
	@Generated
	public static final int kCFErrorHTTPProxyConnectionFailure = 0x00000132;
	@Generated
	public static final int kCFErrorHTTPBadProxyCredentials = 0x00000133;
	@Generated
	public static final int kCFErrorPACFileError = 0x00000134;
	@Generated
	public static final int kCFErrorPACFileAuth = 0x00000135;
	@Generated
	public static final int kCFErrorHTTPSProxyConnectionFailure = 0x00000136;
	@Generated
	public static final int kCFStreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod = 0x00000137;
	@Generated
	public static final int kCFURLErrorUnknown = 0xFFFFFC1A;
	@Generated
	public static final int kCFURLErrorCancelled = 0xFFFFFC19;
	@Generated
	public static final int kCFURLErrorBadURL = 0xFFFFFC18;
	@Generated
	public static final int kCFURLErrorTimedOut = 0xFFFFFC17;
	@Generated
	public static final int kCFURLErrorUnsupportedURL = 0xFFFFFC16;
	@Generated
	public static final int kCFURLErrorCannotFindHost = 0xFFFFFC15;
	@Generated
	public static final int kCFURLErrorCannotConnectToHost = 0xFFFFFC14;
	@Generated
	public static final int kCFURLErrorNetworkConnectionLost = 0xFFFFFC13;
	@Generated
	public static final int kCFURLErrorDNSLookupFailed = 0xFFFFFC12;
	@Generated
	public static final int kCFURLErrorHTTPTooManyRedirects = 0xFFFFFC11;
	@Generated
	public static final int kCFURLErrorResourceUnavailable = 0xFFFFFC10;
	@Generated
	public static final int kCFURLErrorNotConnectedToInternet = 0xFFFFFC0F;
	@Generated
	public static final int kCFURLErrorRedirectToNonExistentLocation = 0xFFFFFC0E;
	@Generated
	public static final int kCFURLErrorBadServerResponse = 0xFFFFFC0D;
	@Generated
	public static final int kCFURLErrorUserCancelledAuthentication = 0xFFFFFC0C;
	@Generated
	public static final int kCFURLErrorUserAuthenticationRequired = 0xFFFFFC0B;
	@Generated
	public static final int kCFURLErrorZeroByteResource = 0xFFFFFC0A;
	@Generated
	public static final int kCFURLErrorCannotDecodeRawData = 0xFFFFFC09;
	@Generated
	public static final int kCFURLErrorCannotDecodeContentData = 0xFFFFFC08;
	@Generated
	public static final int kCFURLErrorCannotParseResponse = 0xFFFFFC07;
	@Generated
	public static final int kCFURLErrorInternationalRoamingOff = 0xFFFFFC06;
	@Generated
	public static final int kCFURLErrorCallIsActive = 0xFFFFFC05;
	@Generated
	public static final int kCFURLErrorDataNotAllowed = 0xFFFFFC04;
	@Generated
	public static final int kCFURLErrorRequestBodyStreamExhausted = 0xFFFFFC03;
	@Generated
	public static final int kCFURLErrorFileDoesNotExist = 0xFFFFFBB4;
	@Generated
	public static final int kCFURLErrorFileIsDirectory = 0xFFFFFBB3;
	@Generated
	public static final int kCFURLErrorNoPermissionsToReadFile = 0xFFFFFBB2;
	@Generated
	public static final int kCFURLErrorDataLengthExceedsMaximum = 0xFFFFFBB1;
	@Generated
	public static final int kCFURLErrorSecureConnectionFailed = 0xFFFFFB50;
	@Generated
	public static final int kCFURLErrorServerCertificateHasBadDate = 0xFFFFFB4F;
	@Generated
	public static final int kCFURLErrorServerCertificateUntrusted = 0xFFFFFB4E;
	@Generated
	public static final int kCFURLErrorServerCertificateHasUnknownRoot = 0xFFFFFB4D;
	@Generated
	public static final int kCFURLErrorServerCertificateNotYetValid = 0xFFFFFB4C;
	@Generated
	public static final int kCFURLErrorClientCertificateRejected = 0xFFFFFB4B;
	@Generated
	public static final int kCFURLErrorClientCertificateRequired = 0xFFFFFB4A;
	@Generated
	public static final int kCFURLErrorCannotLoadFromNetwork = 0xFFFFF830;
	@Generated
	public static final int kCFURLErrorCannotCreateFile = 0xFFFFF448;
	@Generated
	public static final int kCFURLErrorCannotOpenFile = 0xFFFFF447;
	@Generated
	public static final int kCFURLErrorCannotCloseFile = 0xFFFFF446;
	@Generated
	public static final int kCFURLErrorCannotWriteToFile = 0xFFFFF445;
	@Generated
	public static final int kCFURLErrorCannotRemoveFile = 0xFFFFF444;
	@Generated
	public static final int kCFURLErrorCannotMoveFile = 0xFFFFF443;
	@Generated
	public static final int kCFURLErrorDownloadDecodingFailedMidStream = 0xFFFFF442;
	@Generated
	public static final int kCFURLErrorDownloadDecodingFailedToComplete = 0xFFFFF441;
	@Generated
	public static final int kCFHTTPCookieCannotParseCookieFile = 0xFFFFF060;
	@Generated
	public static final int kCFNetServiceErrorUnknown = 0xFFFEE6C0;
	@Generated
	public static final int kCFNetServiceErrorCollision = 0xFFFEE6BF;
	@Generated
	public static final int kCFNetServiceErrorNotFound = 0xFFFEE6BE;
	@Generated
	public static final int kCFNetServiceErrorInProgress = 0xFFFEE6BD;
	@Generated
	public static final int kCFNetServiceErrorBadArgument = 0xFFFEE6BC;
	@Generated
	public static final int kCFNetServiceErrorCancel = 0xFFFEE6BB;
	@Generated
	public static final int kCFNetServiceErrorInvalid = 0xFFFEE6BA;
	@Generated
	public static final int kCFNetServiceErrorTimeout = 0xFFFEE6B9;
	@Generated
	public static final int kCFNetServiceErrorDNSServiceFailure = 0xFFFEE2D8;
}
