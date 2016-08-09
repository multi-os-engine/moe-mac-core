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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSFastEnumeration;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSet extends NSObject implements NSCopying, NSMutableCopying,
		NSSecureCoding, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObserver:forKeyPath:options:context:")
	public native void addObserverForKeyPathOptionsContext(NSObject observer,
			String keyPath, long options, VoidPtr context);

	@Generated
	@Selector("allObjects")
	public native NSArray allObjects();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSet alloc();

	@Generated
	@Selector("anyObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object anyObject();

	@Generated
	@Selector("containsObject:")
	public native boolean containsObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("count")
	public native long count();

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
			Ptr<? extends ObjCObject> buffer, long len);

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateObjectsUsingBlock:")
	public native void enumerateObjectsUsingBlock(
			@ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateObjectsUsingBlock {
		@Generated
		public void call_enumerateObjectsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateObjectsWithOptions:usingBlock:")
	public native void enumerateObjectsWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateObjectsWithOptionsUsingBlock {
		@Generated
		public void call_enumerateObjectsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("filteredSetUsingPredicate:")
	public native NSSet filteredSetUsingPredicate(NSPredicate predicate);

	@Generated
	@Selector("init")
	public native NSSet init();

	@Generated
	@Selector("initWithArray:")
	public native NSSet initWithArray(NSArray array);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSSet initWithObjectsCount(ConstPtr<? extends ObjCObject> objects,
			long cnt);

	@Generated
	@Selector("initWithSet:")
	public native NSSet initWithSet(NSSet set);

	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSSet initWithSetCopyItems(NSSet set, boolean flag);

	@Generated
	@Selector("intersectsSet:")
	public native boolean intersectsSet(NSSet otherSet);

	@Generated
	@Selector("isEqualToSet:")
	public native boolean isEqualToSet(NSSet otherSet);

	@Generated
	@Selector("isSubsetOfSet:")
	public native boolean isSubsetOfSet(NSSet otherSet);

	@Generated
	@Selector("makeObjectsPerformSelector:")
	public native void makeObjectsPerformSelector(SEL aSelector);

	@Generated
	@Selector("makeObjectsPerformSelector:withObject:")
	public native void makeObjectsPerformSelectorWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object argument);

	@Generated
	@Selector("member:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object member(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator objectEnumerator();

	@Generated
	@Selector("objectsPassingTest:")
	public native NSSet objectsPassingTest(
			@ObjCBlock(name = "call_objectsPassingTest") Block_objectsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_objectsPassingTest {
		@Generated
		public boolean call_objectsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("objectsWithOptions:passingTest:")
	public native NSSet objectsWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_objectsWithOptionsPassingTest") Block_objectsWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_objectsWithOptionsPassingTest {
		@Generated
		public boolean call_objectsWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("removeObserver:forKeyPath:")
	public native void removeObserverForKeyPath(NSObject observer,
			String keyPath);

	@Generated
	@Selector("removeObserver:forKeyPath:context:")
	public native void removeObserverForKeyPathContext(NSObject observer,
			String keyPath, VoidPtr context);

	@Generated
	@Selector("set")
	public static native NSSet set();

	@Generated
	@Selector("setByAddingObject:")
	public native NSSet setByAddingObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setByAddingObjectsFromArray:")
	public native NSSet setByAddingObjectsFromArray(NSArray other);

	@Generated
	@Selector("setByAddingObjectsFromSet:")
	public native NSSet setByAddingObjectsFromSet(NSSet other);

	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("setWithArray:")
	public static native NSSet setWithArray(NSArray array);

	@Generated
	@Selector("setWithObject:")
	public static native NSSet setWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setWithObjects:count:")
	public static native NSSet setWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("setWithSet:")
	public static native NSSet setWithSet(NSSet set);

	@Generated
	@Selector("sortedArrayUsingDescriptors:")
	public native NSArray sortedArrayUsingDescriptors(NSArray sortDescriptors);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("valueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKey(String key);
}
