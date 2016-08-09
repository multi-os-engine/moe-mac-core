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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSDictionary;
import mac.foundation.NSError;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentDocument extends NSDocument {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPersistentDocument(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPersistentDocument alloc();

	@Generated
	@Selector("configurePersistentStoreCoordinatorForURL:ofType:error:")
	public native boolean configurePersistentStoreCoordinatorForURLOfTypeError(
			NSURL url, String fileType, Ptr<NSError> error);

	@Generated
	@Selector("configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:")
	public native boolean configurePersistentStoreCoordinatorForURLOfTypeModelConfigurationStoreOptionsError(
			NSURL url, String fileType, String configuration,
			NSDictionary storeOptions, Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native NSPersistentDocument init();

	@Generated
	@Selector("initForURL:withContentsOfURL:ofType:error:")
	public native NSPersistentDocument initForURLWithContentsOfURLOfTypeError(
			NSURL urlOrNil, NSURL contentsURL, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("initWithContentsOfFile:ofType:")
	public native NSPersistentDocument initWithContentsOfFileOfType(
			String absolutePath, String typeName);

	@Generated
	@Selector("initWithContentsOfURL:ofType:")
	public native NSPersistentDocument initWithContentsOfURLOfType(NSURL url,
			String typeName);

	@Generated
	@Selector("initWithContentsOfURL:ofType:error:")
	public native NSPersistentDocument initWithContentsOfURLOfTypeError(
			NSURL url, String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("initWithType:error:")
	public native NSPersistentDocument initWithTypeError(String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("managedObjectModel")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object managedObjectModel();

	@Generated
	@Selector("persistentStoreTypeForFileType:")
	public native String persistentStoreTypeForFileType(String fileType);

	@Generated
	@Selector("readFromURL:ofType:error:")
	public native boolean readFromURLOfTypeError(NSURL absoluteURL,
			String typeName, Ptr<NSError> error);

	@Generated
	@Selector("revertToContentsOfURL:ofType:error:")
	public native boolean revertToContentsOfURLOfTypeError(NSURL inAbsoluteURL,
			String inTypeName, Ptr<NSError> outError);

	@Generated
	@Selector("writeToURL:ofType:forSaveOperation:originalContentsURL:error:")
	public native boolean writeToURLOfTypeForSaveOperationOriginalContentsURLError(
			NSURL absoluteURL, String typeName, long saveOperation,
			NSURL absoluteOriginalContentsURL, Ptr<NSError> error);
}
