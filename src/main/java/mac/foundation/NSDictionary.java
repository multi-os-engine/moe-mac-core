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
public class NSDictionary extends NSObject implements NSCopying,
		NSMutableCopying, NSSecureCoding, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDictionary(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("allKeys")
	public native NSArray allKeys();

	@Generated
	@Selector("allKeysForObject:")
	public native NSArray allKeysForObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("allValues")
	public native NSArray allValues();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDictionary alloc();

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
	@Selector("descriptionInStringsFileFormat")
	public native String descriptionInStringsFileFormat();

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("descriptionWithLocale:indent:")
	public native String descriptionWithLocaleIndent(
			@Mapped(ObjCObjectMapper.class) Object locale, long level);

	@Generated
	@Selector("dictionary")
	public static native NSDictionary dictionary();

	@Generated
	@Selector("dictionaryWithContentsOfFile:")
	public static native NSDictionary dictionaryWithContentsOfFile(String path);

	@Generated
	@Selector("dictionaryWithContentsOfURL:")
	public static native NSDictionary dictionaryWithContentsOfURL(NSURL url);

	@Generated
	@Selector("dictionaryWithDictionary:")
	public static native NSDictionary dictionaryWithDictionary(NSDictionary dict);

	@Generated
	@Selector("dictionaryWithObject:forKey:")
	public static native NSDictionary dictionaryWithObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("dictionaryWithObjects:forKeys:")
	public static native NSDictionary dictionaryWithObjectsForKeys(
			NSArray objects, NSArray keys);

	@Generated
	@Selector("dictionaryWithObjects:forKeys:count:")
	public static native NSDictionary dictionaryWithObjectsForKeysCount(
			ConstPtr<? extends ObjCObject> objects, ConstPtr<? extends ObjCObject> keys, long cnt);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateKeysAndObjectsUsingBlock:")
	public native void enumerateKeysAndObjectsUsingBlock(
			@ObjCBlock(name = "call_enumerateKeysAndObjectsUsingBlock") Block_enumerateKeysAndObjectsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateKeysAndObjectsUsingBlock {
		@Generated
		public void call_enumerateKeysAndObjectsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("enumerateKeysAndObjectsWithOptions:usingBlock:")
	public native void enumerateKeysAndObjectsWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateKeysAndObjectsWithOptionsUsingBlock") Block_enumerateKeysAndObjectsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateKeysAndObjectsWithOptionsUsingBlock {
		@Generated
		public void call_enumerateKeysAndObjectsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("fileCreationDate")
	public native NSDate fileCreationDate();

	@Generated
	@Selector("fileExtensionHidden")
	public native boolean fileExtensionHidden();

	@Generated
	@Selector("fileGroupOwnerAccountID")
	public native NSNumber fileGroupOwnerAccountID();

	@Generated
	@Selector("fileGroupOwnerAccountName")
	public native String fileGroupOwnerAccountName();

	@Generated
	@Selector("fileHFSCreatorCode")
	public native int fileHFSCreatorCode();

	@Generated
	@Selector("fileHFSTypeCode")
	public native int fileHFSTypeCode();

	@Generated
	@Selector("fileIsAppendOnly")
	public native boolean fileIsAppendOnly();

	@Generated
	@Selector("fileIsImmutable")
	public native boolean fileIsImmutable();

	@Generated
	@Selector("fileModificationDate")
	public native NSDate fileModificationDate();

	@Generated
	@Selector("fileOwnerAccountID")
	public native NSNumber fileOwnerAccountID();

	@Generated
	@Selector("fileOwnerAccountName")
	public native String fileOwnerAccountName();

	@Generated
	@Selector("filePosixPermissions")
	public native long filePosixPermissions();

	@Generated
	@Selector("fileSize")
	public native long fileSize();

	@Generated
	@Selector("fileSystemFileNumber")
	public native long fileSystemFileNumber();

	@Generated
	@Selector("fileSystemNumber")
	public native long fileSystemNumber();

	@Generated
	@Selector("fileType")
	public native String fileType();

	@Generated
	@Selector("getObjects:andKeys:")
	public native void getObjectsAndKeys(Ptr<? extends ObjCObject> objects,
			Ptr<? extends ObjCObject> keys);

	@Generated
	@Selector("init")
	public native NSDictionary init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSDictionary initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSDictionary initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithDictionary:")
	public native NSDictionary initWithDictionary(NSDictionary otherDictionary);

	@Generated
	@Selector("initWithDictionary:copyItems:")
	public native NSDictionary initWithDictionaryCopyItems(
			NSDictionary otherDictionary, boolean flag);

	@Generated
	@Selector("initWithObjects:forKeys:")
	public native NSDictionary initWithObjectsForKeys(NSArray objects,
			NSArray keys);

	@Generated
	@Selector("initWithObjects:forKeys:count:")
	public native NSDictionary initWithObjectsForKeysCount(
			ConstPtr<? extends ObjCObject> objects, ConstPtr<? extends ObjCObject> keys, long cnt);

	@Generated
	@Selector("isEqualToDictionary:")
	public native boolean isEqualToDictionary(NSDictionary otherDictionary);

	@Generated
	@Selector("keyEnumerator")
	public native NSEnumerator keyEnumerator();

	@Generated
	@Selector("keysOfEntriesPassingTest:")
	public native NSSet keysOfEntriesPassingTest(
			@ObjCBlock(name = "call_keysOfEntriesPassingTest") Block_keysOfEntriesPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_keysOfEntriesPassingTest {
		@Generated
		public boolean call_keysOfEntriesPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("keysOfEntriesWithOptions:passingTest:")
	public native NSSet keysOfEntriesWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_keysOfEntriesWithOptionsPassingTest") Block_keysOfEntriesWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_keysOfEntriesWithOptionsPassingTest {
		@Generated
		public boolean call_keysOfEntriesWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("keysSortedByValueUsingComparator:")
	public native NSArray keysSortedByValueUsingComparator(
			@ObjCBlock(name = "call_keysSortedByValueUsingComparator") Block_keysSortedByValueUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_keysSortedByValueUsingComparator {
		@Generated
		public long call_keysSortedByValueUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("keysSortedByValueUsingSelector:")
	public native NSArray keysSortedByValueUsingSelector(SEL comparator);

	@Generated
	@Selector("keysSortedByValueWithOptions:usingComparator:")
	public native NSArray keysSortedByValueWithOptionsUsingComparator(
			long opts,
			@ObjCBlock(name = "call_keysSortedByValueWithOptionsUsingComparator") Block_keysSortedByValueWithOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_keysSortedByValueWithOptionsUsingComparator {
		@Generated
		public long call_keysSortedByValueWithOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator objectEnumerator();

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("objectForKeyedSubscript:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKeyedSubscript(
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("objectsForKeys:notFoundMarker:")
	public native NSArray objectsForKeysNotFoundMarker(NSArray keys,
			@Mapped(ObjCObjectMapper.class) Object marker);

	@Generated
	@Selector("sharedKeySetForKeys:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedKeySetForKeys(NSArray keys);

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

	@Generated
	@Selector("writeToFile:atomically:")
	public native boolean writeToFileAtomically(String path,
			boolean useAuxiliaryFile);

	@Generated
	@Selector("writeToURL:atomically:")
	public native boolean writeToURLAtomically(NSURL url, boolean atomically);
}
