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
import mac.appkit.NSImage;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileWrapper extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileWrapper(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addFileWithPath:")
	public native String addFileWithPath(String path);

	@Generated
	@Selector("addFileWrapper:")
	public native String addFileWrapper(NSFileWrapper child);

	@Generated
	@Selector("addRegularFileWithContents:preferredFilename:")
	public native String addRegularFileWithContentsPreferredFilename(
			NSData data, String fileName);

	@Generated
	@Selector("addSymbolicLinkWithDestination:preferredFilename:")
	public native String addSymbolicLinkWithDestinationPreferredFilename(
			String path, String filename);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileWrapper alloc();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fileAttributes")
	public native NSDictionary fileAttributes();

	@Generated
	@Selector("fileWrappers")
	public native NSDictionary fileWrappers();

	@Generated
	@Selector("filename")
	public native String filename();

	@Generated
	@Selector("init")
	public native NSFileWrapper init();

	@Generated
	@Selector("initDirectoryWithFileWrappers:")
	public native NSFileWrapper initDirectoryWithFileWrappers(
			NSDictionary childrenByPreferredName);

	@Generated
	@Selector("initRegularFileWithContents:")
	public native NSFileWrapper initRegularFileWithContents(NSData contents);

	@Generated
	@Selector("initSymbolicLinkWithDestination:")
	public native NSFileWrapper initSymbolicLinkWithDestination(String path);

	@Generated
	@Selector("initSymbolicLinkWithDestinationURL:")
	public native NSFileWrapper initSymbolicLinkWithDestinationURL(NSURL url);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithPath:")
	public native NSFileWrapper initWithPath(String path);

	@Generated
	@Selector("initWithSerializedRepresentation:")
	public native NSFileWrapper initWithSerializedRepresentation(
			NSData serializeRepresentation);

	@Generated
	@Selector("initWithURL:options:error:")
	public native NSFileWrapper initWithURLOptionsError(NSURL url, long options,
			Ptr<NSError> outError);

	@Generated
	@Selector("isDirectory")
	public native boolean isDirectory();

	@Generated
	@Selector("isRegularFile")
	public native boolean isRegularFile();

	@Generated
	@Selector("isSymbolicLink")
	public native boolean isSymbolicLink();

	@Generated
	@Selector("keyForFileWrapper:")
	public native String keyForFileWrapper(NSFileWrapper child);

	@Generated
	@Selector("matchesContentsOfURL:")
	public native boolean matchesContentsOfURL(NSURL url);

	@Generated
	@Selector("needsToBeUpdatedFromPath:")
	public native boolean needsToBeUpdatedFromPath(String path);

	@Generated
	@Selector("preferredFilename")
	public native String preferredFilename();

	@Generated
	@Selector("readFromURL:options:error:")
	public native boolean readFromURLOptionsError(NSURL url, long options,
			Ptr<NSError> outError);

	@Generated
	@Selector("regularFileContents")
	public native NSData regularFileContents();

	@Generated
	@Selector("removeFileWrapper:")
	public native void removeFileWrapper(NSFileWrapper child);

	@Generated
	@Selector("serializedRepresentation")
	public native NSData serializedRepresentation();

	@Generated
	@Selector("setFileAttributes:")
	public native void setFileAttributes(NSDictionary fileAttributes);

	@Generated
	@Selector("setFilename:")
	public native void setFilename(String fileName);

	@Generated
	@Selector("setPreferredFilename:")
	public native void setPreferredFilename(String fileName);

	@Generated
	@Selector("symbolicLinkDestination")
	public native String symbolicLinkDestination();

	@Generated
	@Selector("symbolicLinkDestinationURL")
	public native NSURL symbolicLinkDestinationURL();

	@Generated
	@Selector("updateFromPath:")
	public native boolean updateFromPath(String path);

	@Generated
	@Selector("writeToFile:atomically:updateFilenames:")
	public native boolean writeToFileAtomicallyUpdateFilenames(String path,
			boolean atomicFlag, boolean updateFilenamesFlag);

	@Generated
	@Selector("writeToURL:options:originalContentsURL:error:")
	public native boolean writeToURLOptionsOriginalContentsURLError(NSURL url,
			long options, NSURL originalContentsURL, Ptr<NSError> outError);

	@Generated
	@Selector("icon")
	public native NSImage icon();

	@Generated
	@Selector("setIcon:")
	public native void setIcon(NSImage icon);
}
