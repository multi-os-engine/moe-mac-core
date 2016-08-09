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
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCharacterSet extends NSObject implements NSCopying,
		NSMutableCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCharacterSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLFragmentAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLFragmentAllowedCharacterSet();

	@Generated
	@Selector("URLHostAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLHostAllowedCharacterSet();

	@Generated
	@Selector("URLPasswordAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLPasswordAllowedCharacterSet();

	@Generated
	@Selector("URLPathAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLPathAllowedCharacterSet();

	@Generated
	@Selector("URLQueryAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLQueryAllowedCharacterSet();

	@Generated
	@Selector("URLUserAllowedCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object URLUserAllowedCharacterSet();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCharacterSet alloc();

	@Generated
	@Selector("alphanumericCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object alphanumericCharacterSet();

	@Generated
	@Selector("bitmapRepresentation")
	public native NSData bitmapRepresentation();

	@Generated
	@Selector("capitalizedLetterCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object capitalizedLetterCharacterSet();

	@Generated
	@Selector("characterIsMember:")
	public native boolean characterIsMember(char aCharacter);

	@Generated
	@Selector("characterSetWithBitmapRepresentation:")
	public static native NSCharacterSet characterSetWithBitmapRepresentation(
			NSData data);

	@Generated
	@Selector("characterSetWithCharactersInString:")
	public static native NSCharacterSet characterSetWithCharactersInString(
			String aString);

	@Generated
	@Selector("characterSetWithContentsOfFile:")
	public static native NSCharacterSet characterSetWithContentsOfFile(
			String fName);

	@Generated
	@Selector("characterSetWithRange:")
	public static native NSCharacterSet characterSetWithRange(
			@ByValue NSRange aRange);

	@Generated
	@Selector("controlCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object controlCharacterSet();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("decimalDigitCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object decimalDigitCharacterSet();

	@Generated
	@Selector("decomposableCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object decomposableCharacterSet();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hasMemberInPlane:")
	public native boolean hasMemberInPlane(byte thePlane);

	@Generated
	@Selector("illegalCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object illegalCharacterSet();

	@Generated
	@Selector("init")
	public native NSCharacterSet init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("invertedSet")
	public native NSCharacterSet invertedSet();

	@Generated
	@Selector("isSupersetOfSet:")
	public native boolean isSupersetOfSet(NSCharacterSet theOtherSet);

	@Generated
	@Selector("letterCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object letterCharacterSet();

	@Generated
	@Selector("longCharacterIsMember:")
	public native boolean longCharacterIsMember(int theLongChar);

	@Generated
	@Selector("lowercaseLetterCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object lowercaseLetterCharacterSet();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("newlineCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object newlineCharacterSet();

	@Generated
	@Selector("nonBaseCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object nonBaseCharacterSet();

	@Generated
	@Selector("punctuationCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object punctuationCharacterSet();

	@Generated
	@Selector("symbolCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object symbolCharacterSet();

	@Generated
	@Selector("uppercaseLetterCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object uppercaseLetterCharacterSet();

	@Generated
	@Selector("whitespaceAndNewlineCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object whitespaceAndNewlineCharacterSet();

	@Generated
	@Selector("whitespaceCharacterSet")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object whitespaceCharacterSet();
}
