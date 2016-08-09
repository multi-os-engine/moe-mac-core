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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileCoordinator extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileCoordinator(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addFilePresenter:")
	public static native void addFilePresenter(
			@Mapped(ObjCObjectMapper.class) Object filePresenter);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileCoordinator alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("coordinateReadingItemAtURL:options:error:byAccessor:")
	public native void coordinateReadingItemAtURLOptionsErrorByAccessor(
			NSURL url,
			long options,
			Ptr<NSError> outError,
			@ObjCBlock(name = "call_coordinateReadingItemAtURLOptionsErrorByAccessor") Block_coordinateReadingItemAtURLOptionsErrorByAccessor reader);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_coordinateReadingItemAtURLOptionsErrorByAccessor {
		@Generated
		public void call_coordinateReadingItemAtURLOptionsErrorByAccessor(
				NSURL arg0);
	}

	@Generated
	@Selector("coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
	public native void coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(
			NSURL readingURL,
			long readingOptions,
			NSURL writingURL,
			long writingOptions,
			Ptr<NSError> outError,
			@ObjCBlock(name = "call_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor") Block_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor readerWriter);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor {
		@Generated
		public void call_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(
				NSURL arg0, NSURL arg1);
	}

	@Generated
	@Selector("coordinateWritingItemAtURL:options:error:byAccessor:")
	public native void coordinateWritingItemAtURLOptionsErrorByAccessor(
			NSURL url,
			long options,
			Ptr<NSError> outError,
			@ObjCBlock(name = "call_coordinateWritingItemAtURLOptionsErrorByAccessor") Block_coordinateWritingItemAtURLOptionsErrorByAccessor writer);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_coordinateWritingItemAtURLOptionsErrorByAccessor {
		@Generated
		public void call_coordinateWritingItemAtURLOptionsErrorByAccessor(
				NSURL arg0);
	}

	@Generated
	@Selector("coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
	public native void coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(
			NSURL url1,
			long options1,
			NSURL url2,
			long options2,
			Ptr<NSError> outError,
			@ObjCBlock(name = "call_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor") Block_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor writer);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor {
		@Generated
		public void call_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(
				NSURL arg0, NSURL arg1);
	}

	@Generated
	@Selector("filePresenters")
	public static native NSArray filePresenters();

	@Generated
	@Selector("init")
	public native NSFileCoordinator init();

	@Generated
	@Selector("initWithFilePresenter:")
	public native NSFileCoordinator initWithFilePresenter(
			@Mapped(ObjCObjectMapper.class) Object filePresenterOrNil);

	@Generated
	@Selector("itemAtURL:didMoveToURL:")
	public native void itemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);

	@Generated
	@Selector("itemAtURL:willMoveToURL:")
	public native void itemAtURLWillMoveToURL(NSURL oldURL, NSURL newURL);

	@Generated
	@Selector("removeFilePresenter:")
	public static native void removeFilePresenter(
			@Mapped(ObjCObjectMapper.class) Object filePresenter);
}
