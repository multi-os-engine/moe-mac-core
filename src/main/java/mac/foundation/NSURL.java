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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSPasteboard;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.protocol.NSURLHandleClient;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURL extends NSObject implements NSSecureCoding, NSCopying,
		NSURLHandleClient, NSPasteboardWriting, NSPasteboardReading {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURL(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLByAppendingPathComponent:")
	public native NSURL URLByAppendingPathComponent(String pathComponent);

	@Generated
	@Selector("URLByAppendingPathComponent:isDirectory:")
	public native NSURL URLByAppendingPathComponentIsDirectory(
			String pathComponent, boolean isDirectory);

	@Generated
	@Selector("URLByAppendingPathExtension:")
	public native NSURL URLByAppendingPathExtension(String pathExtension);

	@Generated
	@Selector("URLByDeletingLastPathComponent")
	public native NSURL URLByDeletingLastPathComponent();

	@Generated
	@Selector("URLByDeletingPathExtension")
	public native NSURL URLByDeletingPathExtension();

	@Generated
	@Selector("URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
	public static native NSURL URLByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(
			NSData bookmarkData, long options, NSURL relativeURL,
			BoolPtr isStale, Ptr<NSError> error);

	@Generated
	@Selector("URLByResolvingSymlinksInPath")
	public native NSURL URLByResolvingSymlinksInPath();

	@Generated
	@Selector("URLByStandardizingPath")
	public native NSURL URLByStandardizingPath();

	@Generated
	@Selector("URLHandle:resourceDataDidBecomeAvailable:")
	public native void URLHandleResourceDataDidBecomeAvailable(
			NSURLHandle sender, NSData newBytes);

	@Generated
	@Selector("URLHandle:resourceDidFailLoadingWithReason:")
	public native void URLHandleResourceDidFailLoadingWithReason(
			NSURLHandle sender, String reason);

	@Generated
	@Selector("URLHandleResourceDidBeginLoading:")
	public native void URLHandleResourceDidBeginLoading(NSURLHandle sender);

	@Generated
	@Selector("URLHandleResourceDidCancelLoading:")
	public native void URLHandleResourceDidCancelLoading(NSURLHandle sender);

	@Generated
	@Selector("URLHandleResourceDidFinishLoading:")
	public native void URLHandleResourceDidFinishLoading(NSURLHandle sender);

	@Generated
	@Selector("URLHandleUsingCache:")
	public native NSURLHandle URLHandleUsingCache(boolean shouldUseCache);

	@Generated
	@Selector("URLWithString:")
	public static native NSURL URLWithString(String URLString);

	@Generated
	@Selector("URLWithString:relativeToURL:")
	public static native NSURL URLWithStringRelativeToURL(String URLString,
			NSURL baseURL);

	@Generated
	@Selector("absoluteString")
	public native String absoluteString();

	@Generated
	@Selector("absoluteURL")
	public native NSURL absoluteURL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURL alloc();

	@Generated
	@Selector("baseURL")
	public native NSURL baseURL();

	@Generated
	@Selector("bookmarkDataWithContentsOfURL:error:")
	public static native NSData bookmarkDataWithContentsOfURLError(
			NSURL bookmarkFileURL, Ptr<NSError> error);

	@Generated
	@Selector("bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
	public native NSData bookmarkDataWithOptionsIncludingResourceValuesForKeysRelativeToURLError(
			long options, NSArray keys, NSURL relativeURL, Ptr<NSError> error);

	@Generated
	@Selector("checkResourceIsReachableAndReturnError:")
	public native boolean checkResourceIsReachableAndReturnError(
			Ptr<NSError> error);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("filePathURL")
	public native NSURL filePathURL();

	@Generated
	@Selector("fileReferenceURL")
	public native NSURL fileReferenceURL();

	@Generated
	@Selector("fileSystemRepresentation")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String fileSystemRepresentation();

	@Generated
	@Selector("fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String path,
			boolean isDir, NSURL baseURL);

	@Generated
	@Selector("fileURLWithPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fileURLWithPath(String path);

	@Generated
	@Selector("fileURLWithPath:isDirectory:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fileURLWithPathIsDirectory(String path,
			boolean isDir);

	@Generated
	@Selector("fileURLWithPathComponents:")
	public static native NSURL fileURLWithPathComponents(NSArray components);

	@Generated
	@Selector("fragment")
	public native String fragment();

	@Generated
	@Selector("getFileSystemRepresentation:maxLength:")
	public native boolean getFileSystemRepresentationMaxLength(BytePtr buffer,
			long maxBufferLength);

	@Generated
	@Selector("getResourceValue:forKey:error:")
	public native boolean getResourceValueForKeyError(Ptr<? extends ObjCObject> value,
			String key, Ptr<NSError> error);

	@Generated
	@Selector("host")
	public native String host();

	@Generated
	@Selector("init")
	public native NSURL init();

	@Generated
	@Selector("initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
	public native NSURL initByResolvingBookmarkDataOptionsRelativeToURLBookmarkDataIsStaleError(
			NSData bookmarkData, long options, NSURL relativeURL,
			BoolPtr isStale, Ptr<NSError> error);

	@Generated
	@Selector("initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
	public native NSURL initFileURLWithFileSystemRepresentationIsDirectoryRelativeToURL(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String path,
			boolean isDir, NSURL baseURL);

	@Generated
	@Selector("initFileURLWithPath:")
	public native NSURL initFileURLWithPath(String path);

	@Generated
	@Selector("initFileURLWithPath:isDirectory:")
	public native NSURL initFileURLWithPathIsDirectory(String path,
			boolean isDir);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithScheme:host:path:")
	public native NSURL initWithSchemeHostPath(String scheme, String host,
			String path);

	@Generated
	@Selector("initWithString:")
	public native NSURL initWithString(String URLString);

	@Generated
	@Selector("initWithString:relativeToURL:")
	public native NSURL initWithStringRelativeToURL(String URLString,
			NSURL baseURL);

	@Generated
	@Selector("isFileReferenceURL")
	public native boolean isFileReferenceURL();

	@Generated
	@Selector("isFileURL")
	public native boolean isFileURL();

	@Generated
	@Selector("lastPathComponent")
	public native String lastPathComponent();

	@Generated
	@Selector("loadResourceDataNotifyingClient:usingCache:")
	public native void loadResourceDataNotifyingClientUsingCache(
			@Mapped(ObjCObjectMapper.class) Object client,
			boolean shouldUseCache);

	@Generated
	@Selector("parameterString")
	public native String parameterString();

	@Generated
	@Selector("password")
	public native String password();

	@Generated
	@Selector("path")
	public native String path();

	@Generated
	@Selector("pathComponents")
	public native NSArray pathComponents();

	@Generated
	@Selector("pathExtension")
	public native String pathExtension();

	@Generated
	@Selector("port")
	public native NSNumber port();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String propertyKey);

	@Generated
	@Selector("query")
	public native String query();

	@Generated
	@Selector("relativePath")
	public native String relativePath();

	@Generated
	@Selector("relativeString")
	public native String relativeString();

	@Generated
	@Selector("removeAllCachedResourceValues")
	public native void removeAllCachedResourceValues();

	@Generated
	@Selector("removeCachedResourceValueForKey:")
	public native void removeCachedResourceValueForKey(String key);

	@Generated
	@Selector("resourceDataUsingCache:")
	public native NSData resourceDataUsingCache(boolean shouldUseCache);

	@Generated
	@Selector("resourceSpecifier")
	public native String resourceSpecifier();

	@Generated
	@Selector("resourceValuesForKeys:error:")
	public native NSDictionary resourceValuesForKeysError(NSArray keys,
			Ptr<NSError> error);

	@Generated
	@Selector("resourceValuesForKeys:fromBookmarkData:")
	public static native NSDictionary resourceValuesForKeysFromBookmarkData(
			NSArray keys, NSData bookmarkData);

	@Generated
	@Selector("scheme")
	public native String scheme();

	@Generated
	@Selector("setProperty:forKey:")
	public native boolean setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object property, String propertyKey);

	@Generated
	@Selector("setResourceData:")
	public native boolean setResourceData(NSData data);

	@Generated
	@Selector("setResourceValue:forKey:error:")
	public native boolean setResourceValueForKeyError(
			@Mapped(ObjCObjectMapper.class) Object value, String key,
			Ptr<NSError> error);

	@Generated
	@Selector("setResourceValues:error:")
	public native boolean setResourceValuesError(NSDictionary keyedValues,
			Ptr<NSError> error);

	@Generated
	@Selector("setTemporaryResourceValue:forKey:")
	public native void setTemporaryResourceValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("standardizedURL")
	public native NSURL standardizedURL();

	@Generated
	@Selector("startAccessingSecurityScopedResource")
	public native boolean startAccessingSecurityScopedResource();

	@Generated
	@Selector("stopAccessingSecurityScopedResource")
	public native void stopAccessingSecurityScopedResource();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("user")
	public native String user();

	@Generated
	@Selector("writeBookmarkData:toURL:options:error:")
	public static native boolean writeBookmarkDataToURLOptionsError(
			NSData bookmarkData, NSURL bookmarkFileURL, long options,
			Ptr<NSError> error);

	@Generated
	@Selector("URLFromPasteboard:")
	public static native NSURL URLFromPasteboard(NSPasteboard pasteBoard);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("writeToPasteboard:")
	public native void writeToPasteboard(NSPasteboard pasteBoard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
