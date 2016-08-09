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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLDownload extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLDownload(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLDownload alloc();

	@Generated
	@Selector("canResumeDownloadDecodedWithEncodingMIMEType:")
	public static native boolean canResumeDownloadDecodedWithEncodingMIMEType(
			String MIMEType);

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("deletesFileUponFailure")
	public native boolean deletesFileUponFailure();

	@Generated
	@Selector("init")
	public native NSURLDownload init();

	@Generated
	@Selector("initWithRequest:delegate:")
	public native NSURLDownload initWithRequestDelegate(NSURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("initWithResumeData:delegate:path:")
	public native NSURLDownload initWithResumeDataDelegatePath(
			NSData resumeData, @Mapped(ObjCObjectMapper.class) Object delegate,
			String path);

	@Generated
	@Selector("request")
	public native NSURLRequest request();

	@Generated
	@Selector("resumeData")
	public native NSData resumeData();

	@Generated
	@Selector("setDeletesFileUponFailure:")
	public native void setDeletesFileUponFailure(boolean deletesFileUponFailure);

	@Generated
	@Selector("setDestination:allowOverwrite:")
	public native void setDestinationAllowOverwrite(String path,
			boolean allowOverwrite);
}
