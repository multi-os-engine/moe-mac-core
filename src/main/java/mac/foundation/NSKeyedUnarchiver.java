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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSKeyedUnarchiver extends NSCoder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSKeyedUnarchiver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSKeyedUnarchiver alloc();

	@Generated
	@Selector("classForClassName:")
	public static native Class classForClassName_static(String codedName);

	@Generated
	@Selector("classForClassName:")
	public native Class classForClassName(String codedName);

	@Generated
	@Selector("containsValueForKey:")
	public native boolean containsValueForKey(String key);

	@Generated
	@Selector("decodeBoolForKey:")
	public native boolean decodeBoolForKey(String key);

	@Generated
	@Selector("decodeBytesForKey:returnedLength:")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String decodeBytesForKeyReturnedLength(String key,
			LongPtr lengthp);

	@Generated
	@Selector("decodeDoubleForKey:")
	public native double decodeDoubleForKey(String key);

	@Generated
	@Selector("decodeFloatForKey:")
	public native float decodeFloatForKey(String key);

	@Generated
	@Selector("decodeInt32ForKey:")
	public native int decodeInt32ForKey(String key);

	@Generated
	@Selector("decodeInt64ForKey:")
	public native long decodeInt64ForKey(String key);

	@Generated
	@Selector("decodeIntForKey:")
	public native int decodeIntForKey(String key);

	@Generated
	@Selector("decodeObjectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object decodeObjectForKey(String key);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("finishDecoding")
	public native void finishDecoding();

	@Generated
	@Selector("init")
	public native NSKeyedUnarchiver init();

	@Generated
	@Selector("initForReadingWithData:")
	public native NSKeyedUnarchiver initForReadingWithData(NSData data);

	@Generated
	@Selector("setClass:forClassName:")
	public static native void setClassForClassName_static(Class cls,
			String codedName);

	@Generated
	@Selector("setClass:forClassName:")
	public native void setClassForClassName(Class cls, String codedName);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setRequiresSecureCoding:")
	public native void setRequiresSecureCoding(boolean b);

	@Generated
	@Selector("unarchiveObjectWithData:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object unarchiveObjectWithData(NSData data);

	@Generated
	@Selector("unarchiveObjectWithFile:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object unarchiveObjectWithFile(String path);
}
