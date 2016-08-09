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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSKeyedArchiver extends NSCoder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSKeyedArchiver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSKeyedArchiver alloc();

	@Generated
	@Selector("archiveRootObject:toFile:")
	public static native boolean archiveRootObjectToFile(
			@Mapped(ObjCObjectMapper.class) Object rootObject, String path);

	@Generated
	@Selector("archivedDataWithRootObject:")
	public static native NSData archivedDataWithRootObject(
			@Mapped(ObjCObjectMapper.class) Object rootObject);

	@Generated
	@Selector("classNameForClass:")
	public static native String classNameForClass_static(Class cls);

	@Generated
	@Selector("classNameForClass:")
	public native String classNameForClass(Class cls);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("encodeBool:forKey:")
	public native void encodeBoolForKey(boolean boolv, String key);

	@Generated
	@Selector("encodeBytes:length:forKey:")
	public native void encodeBytesLengthForKey(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytesp,
			long lenv, String key);

	@Generated
	@Selector("encodeConditionalObject:forKey:")
	public native void encodeConditionalObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	@Generated
	@Selector("encodeDouble:forKey:")
	public native void encodeDoubleForKey(double realv, String key);

	@Generated
	@Selector("encodeFloat:forKey:")
	public native void encodeFloatForKey(float realv, String key);

	@Generated
	@Selector("encodeInt32:forKey:")
	public native void encodeInt32ForKey(int intv, String key);

	@Generated
	@Selector("encodeInt64:forKey:")
	public native void encodeInt64ForKey(long intv, String key);

	@Generated
	@Selector("encodeInt:forKey:")
	public native void encodeIntForKey(int intv, String key);

	@Generated
	@Selector("encodeObject:forKey:")
	public native void encodeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object objv, String key);

	@Generated
	@Selector("finishEncoding")
	public native void finishEncoding();

	@Generated
	@Selector("init")
	public native NSKeyedArchiver init();

	@Generated
	@Selector("initForWritingWithMutableData:")
	public native NSKeyedArchiver initForWritingWithMutableData(
			NSMutableData data);

	@Generated
	@Selector("outputFormat")
	public native long outputFormat();

	@Generated
	@Selector("setClassName:forClass:")
	public static native void setClassNameForClass_static(String codedName,
			Class cls);

	@Generated
	@Selector("setClassName:forClass:")
	public native void setClassNameForClass(String codedName, Class cls);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setOutputFormat:")
	public native void setOutputFormat(long format);

	@Generated
	@Selector("setRequiresSecureCoding:")
	public native void setRequiresSecureCoding(boolean b);
}
