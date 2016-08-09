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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileVersion extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileVersion(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Selector("addVersionOfItemAtURL:withContentsOfURL:options:error:")
	public static native NSFileVersion addVersionOfItemAtURLWithContentsOfURLOptionsError(
			NSURL url, NSURL contentsURL, long options, Ptr<NSError> outError);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileVersion alloc();

	@Generated
	@Selector("currentVersionOfItemAtURL:")
	public static native NSFileVersion currentVersionOfItemAtURL(NSURL url);

	@Generated
	@Selector("init")
	public native NSFileVersion init();

	@Generated
	@Selector("isConflict")
	public native boolean isConflict();

	@Generated
	@Selector("isDiscardable")
	public native boolean isDiscardable();

	@Generated
	@Selector("isResolved")
	public native boolean isResolved();

	@Generated
	@Selector("localizedName")
	public native String localizedName();

	@Generated
	@Selector("localizedNameOfSavingComputer")
	public native String localizedNameOfSavingComputer();

	@Generated
	@Selector("modificationDate")
	public native NSDate modificationDate();

	@Generated
	@Selector("otherVersionsOfItemAtURL:")
	public static native NSArray otherVersionsOfItemAtURL(NSURL url);

	@Generated
	@Selector("persistentIdentifier")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object persistentIdentifier();

	@Generated
	@Selector("removeAndReturnError:")
	public native boolean removeAndReturnError(Ptr<NSError> outError);

	@Generated
	@Selector("removeOtherVersionsOfItemAtURL:error:")
	public static native boolean removeOtherVersionsOfItemAtURLError(NSURL url,
			Ptr<NSError> outError);

	@Generated
	@Selector("replaceItemAtURL:options:error:")
	public native NSURL replaceItemAtURLOptionsError(NSURL url, long options,
			Ptr<NSError> error);

	@Generated
	@Selector("setDiscardable:")
	public native void setDiscardable(boolean value);

	@Generated
	@Selector("setResolved:")
	public native void setResolved(boolean value);

	@Generated
	@Selector("temporaryDirectoryURLForNewVersionOfItemAtURL:")
	public static native NSURL temporaryDirectoryURLForNewVersionOfItemAtURL(
			NSURL url);

	@Generated
	@Selector("unresolvedConflictVersionsOfItemAtURL:")
	public static native NSArray unresolvedConflictVersionsOfItemAtURL(NSURL url);

	@Generated
	@Selector("versionOfItemAtURL:forPersistentIdentifier:")
	public static native NSFileVersion versionOfItemAtURLForPersistentIdentifier(
			NSURL url,
			@Mapped(ObjCObjectMapper.class) Object persistentIdentifier);
}
