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
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSURL;
import mac.foundation.NSURLSession;
import mac.foundation.NSURLSessionDownloadTask;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDownloadDelegate")
public interface NSURLSessionDownloadDelegate extends NSURLSessionTaskDelegate {
	@Generated
	@Selector("URLSession:downloadTask:didFinishDownloadingToURL:")
	public void URLSessionDownloadTaskDidFinishDownloadingToURL(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			NSURL location);

	@Generated
	@Selector("URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
	public void URLSessionDownloadTaskDidResumeAtOffsetExpectedTotalBytes(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			long fileOffset, long expectedTotalBytes);

	@Generated
	@Selector("URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
	public void URLSessionDownloadTaskDidWriteDataTotalBytesWrittenTotalBytesExpectedToWrite(
			NSURLSession session, NSURLSessionDownloadTask downloadTask,
			long bytesWritten, long totalBytesWritten,
			long totalBytesExpectedToWrite);
}
