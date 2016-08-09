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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSMutableDictionary;
import mac.foundation.NSURL;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPDFInfo extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPDFInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPDFInfo alloc();

	@Generated
	@Selector("attributes")
	public native NSMutableDictionary attributes();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPDFInfo init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isFileExtensionHidden")
	public native boolean isFileExtensionHidden();

	@Generated
	@Selector("orientation")
	public native long orientation();

	@Generated
	@Selector("paperSize")
	@ByValue
	public native CGSize paperSize();

	@Generated
	@Selector("setFileExtensionHidden:")
	public native void setFileExtensionHidden(boolean value);

	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(long value);

	@Generated
	@Selector("setPaperSize:")
	public native void setPaperSize(@ByValue CGSize value);

	@Generated
	@Selector("setTagNames:")
	public native void setTagNames(NSArray value);

	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	@Generated
	@Selector("tagNames")
	public native NSArray tagNames();
}
