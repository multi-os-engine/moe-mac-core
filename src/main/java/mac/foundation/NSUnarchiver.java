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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUnarchiver extends NSCoder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUnarchiver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUnarchiver alloc();

	@Generated
	@Selector("classNameDecodedForArchiveClassName:")
	public static native String classNameDecodedForArchiveClassName_static(
			String inArchiveName);

	@Generated
	@Selector("classNameDecodedForArchiveClassName:")
	public native String classNameDecodedForArchiveClassName(
			String inArchiveName);

	@Generated
	@Selector("decodeClassName:asClassName:")
	public static native void decodeClassNameAsClassName_static(
			String inArchiveName, String trueName);

	@Generated
	@Selector("decodeClassName:asClassName:")
	public native void decodeClassNameAsClassName(String inArchiveName,
			String trueName);

	@Generated
	@Selector("init")
	public native NSUnarchiver init();

	@Generated
	@Selector("initForReadingWithData:")
	public native NSUnarchiver initForReadingWithData(NSData data);

	@Generated
	@Selector("isAtEnd")
	public native boolean isAtEnd();

	@Generated
	@Selector("objectZone")
	public native VoidPtr objectZone();

	@Generated
	@Selector("replaceObject:withObject:")
	public native void replaceObjectWithObject(
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object newObject);

	@Generated
	@Selector("setObjectZone:")
	public native void setObjectZone(VoidPtr zone);

	@Generated
	@Selector("systemVersion")
	public native int systemVersion();

	@Generated
	@Selector("unarchiveObjectWithData:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object unarchiveObjectWithData(NSData data);

	@Generated
	@Selector("unarchiveObjectWithFile:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object unarchiveObjectWithFile(String path);
}
