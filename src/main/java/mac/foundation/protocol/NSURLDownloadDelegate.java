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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.*;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLDownloadDelegate")
public interface NSURLDownloadDelegate {
	@Generated
	@IsOptional
	@Selector("download:canAuthenticateAgainstProtectionSpace:")
	public boolean downloadCanAuthenticateAgainstProtectionSpace(
			NSURLDownload connection, NSURLProtectionSpace protectionSpace);

	@Generated
	@IsOptional
	@Selector("download:decideDestinationWithSuggestedFilename:")
	public void downloadDecideDestinationWithSuggestedFilename(
			NSURLDownload download, String filename);

	@Generated
	@IsOptional
	@Selector("download:didCancelAuthenticationChallenge:")
	public void downloadDidCancelAuthenticationChallenge(
			NSURLDownload download, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("download:didCreateDestination:")
	public void downloadDidCreateDestination(NSURLDownload download, String path);

	@Generated
	@IsOptional
	@Selector("download:didFailWithError:")
	public void downloadDidFailWithError(NSURLDownload download, NSError error);

	@Generated
	@IsOptional
	@Selector("download:didReceiveAuthenticationChallenge:")
	public void downloadDidReceiveAuthenticationChallenge(
			NSURLDownload download, NSURLAuthenticationChallenge challenge);

	@Generated
	@IsOptional
	@Selector("download:didReceiveDataOfLength:")
	public void downloadDidReceiveDataOfLength(NSURLDownload download,
			long length);

	@Generated
	@IsOptional
	@Selector("download:didReceiveResponse:")
	public void downloadDidReceiveResponse(NSURLDownload download,
			NSURLResponse response);

	@Generated
	@IsOptional
	@Selector("download:shouldDecodeSourceDataOfMIMEType:")
	public boolean downloadShouldDecodeSourceDataOfMIMEType(
			NSURLDownload download, String encodingType);

	@Generated
	@IsOptional
	@Selector("download:willResumeWithResponse:fromByte:")
	public void downloadWillResumeWithResponseFromByte(NSURLDownload download,
			NSURLResponse response, long startingByte);

	@Generated
	@IsOptional
	@Selector("download:willSendRequest:redirectResponse:")
	public NSURLRequest downloadWillSendRequestRedirectResponse(
			NSURLDownload download, NSURLRequest request,
			NSURLResponse redirectResponse);

	@Generated
	@IsOptional
	@Selector("downloadDidBegin:")
	public void downloadDidBegin(NSURLDownload download);

	@Generated
	@IsOptional
	@Selector("downloadDidFinish:")
	public void downloadDidFinish(NSURLDownload download);

	@Generated
	@IsOptional
	@Selector("downloadShouldUseCredentialStorage:")
	public boolean downloadShouldUseCredentialStorage(NSURLDownload download);
}
