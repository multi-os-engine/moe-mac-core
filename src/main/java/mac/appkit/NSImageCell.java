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
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSImageCell extends NSCell implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSImageCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSImageCell alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("imageAlignment")
	public native long imageAlignment();

	@Generated
	@Selector("imageFrameStyle")
	public native long imageFrameStyle();

	@Generated
	@Selector("imageScaling")
	public native long imageScaling();

	@Generated
	@Selector("init")
	public native NSImageCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSImageCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSImageCell initTextCell(String aString);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("setImageAlignment:")
	public native void setImageAlignment(long newAlign);

	@Generated
	@Selector("setImageFrameStyle:")
	public native void setImageFrameStyle(long newStyle);

	@Generated
	@Selector("setImageScaling:")
	public native void setImageScaling(long newScaling);
}
