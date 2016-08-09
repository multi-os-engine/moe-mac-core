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
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSCoder;
import mac.foundation.NSData;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOpenGLPixelFormat extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenGLPixelFormat(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGLPixelFormatObj")
	public native VoidPtr CGLPixelFormatObj();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenGLPixelFormat alloc();

	@Generated
	@Selector("attributes")
	public native NSData attributes();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getValues:forAttribute:forVirtualScreen:")
	public native void getValuesForAttributeForVirtualScreen(IntPtr vals,
			int attrib, int screen);

	@Generated
	@Selector("init")
	public native NSOpenGLPixelFormat init();

	@Generated
	@Selector("initWithAttributes:")
	public native NSOpenGLPixelFormat initWithAttributes(ConstIntPtr attribs);

	@Generated
	@Selector("initWithCGLPixelFormatObj:")
	public native NSOpenGLPixelFormat initWithCGLPixelFormatObj(VoidPtr format);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithData:")
	public native NSOpenGLPixelFormat initWithData(NSData attribs);

	@Generated
	@Selector("numberOfVirtualScreens")
	public native int numberOfVirtualScreens();

	@Generated
	@Selector("setAttributes:")
	public native void setAttributes(NSData attribs);
}
