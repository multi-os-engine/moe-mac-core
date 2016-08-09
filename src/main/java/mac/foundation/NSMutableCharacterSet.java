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
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableCharacterSet extends NSCharacterSet implements NSCopying,
		NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableCharacterSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addCharactersInRange:")
	public native void addCharactersInRange(@ByValue NSRange aRange);

	@Generated
	@Selector("addCharactersInString:")
	public native void addCharactersInString(String aString);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableCharacterSet alloc();

	@Generated
	@Selector("characterSetWithBitmapRepresentation:")
	public static native NSMutableCharacterSet characterSetWithBitmapRepresentation(
			NSData data);

	@Generated
	@Selector("characterSetWithCharactersInString:")
	public static native NSMutableCharacterSet characterSetWithCharactersInString(
			String aString);

	@Generated
	@Selector("characterSetWithContentsOfFile:")
	public static native NSMutableCharacterSet characterSetWithContentsOfFile(
			String fName);

	@Generated
	@Selector("characterSetWithRange:")
	public static native NSMutableCharacterSet characterSetWithRange(
			@ByValue NSRange aRange);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("formIntersectionWithCharacterSet:")
	public native void formIntersectionWithCharacterSet(NSCharacterSet otherSet);

	@Generated
	@Selector("formUnionWithCharacterSet:")
	public native void formUnionWithCharacterSet(NSCharacterSet otherSet);

	@Generated
	@Selector("init")
	public native NSMutableCharacterSet init();

	@Generated
	@Selector("invert")
	public native void invert();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("removeCharactersInRange:")
	public native void removeCharactersInRange(@ByValue NSRange aRange);

	@Generated
	@Selector("removeCharactersInString:")
	public native void removeCharactersInString(String aString);
}
