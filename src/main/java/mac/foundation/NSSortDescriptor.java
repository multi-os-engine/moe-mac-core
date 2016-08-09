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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSortDescriptor extends NSObject implements NSSecureCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSortDescriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSortDescriptor alloc();

	@Generated
	@Selector("allowEvaluation")
	public native void allowEvaluation();

	@Generated
	@Selector("ascending")
	public native boolean ascending();

	@Generated
	@Selector("compareObject:toObject:")
	public native long compareObjectToObject(
			@Mapped(ObjCObjectMapper.class) Object object1,
			@Mapped(ObjCObjectMapper.class) Object object2);

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
	public native NSSortDescriptor init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithKey:ascending:")
	public native NSSortDescriptor initWithKeyAscending(String key,
			boolean ascending);

	@Generated
	@Selector("initWithKey:ascending:comparator:")
	public native NSSortDescriptor initWithKeyAscendingComparator(
			String key,
			boolean ascending,
			@ObjCBlock(name = "call_initWithKeyAscendingComparator") Block_initWithKeyAscendingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_initWithKeyAscendingComparator {
		@Generated
		public long call_initWithKeyAscendingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("initWithKey:ascending:selector:")
	public native NSSortDescriptor initWithKeyAscendingSelector(String key,
			boolean ascending, SEL selector);

	@Generated
	@Selector("key")
	public native String key();

	@Generated
	@Selector("reversedSortDescriptor")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object reversedSortDescriptor();

	@Generated
	@Selector("selector")
	public native SEL selector();

	@Generated
	@Selector("sortDescriptorWithKey:ascending:")
	public static native NSSortDescriptor sortDescriptorWithKeyAscending(
			String key, boolean ascending);

	@Generated
	@Selector("sortDescriptorWithKey:ascending:comparator:")
	public static native NSSortDescriptor sortDescriptorWithKeyAscendingComparator(
			String key,
			boolean ascending,
			@ObjCBlock(name = "call_sortDescriptorWithKeyAscendingComparator") Block_sortDescriptorWithKeyAscendingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortDescriptorWithKeyAscendingComparator {
		@Generated
		public long call_sortDescriptorWithKeyAscendingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("sortDescriptorWithKey:ascending:selector:")
	public static native NSSortDescriptor sortDescriptorWithKeyAscendingSelector(
			String key, boolean ascending, SEL selector);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}
}
