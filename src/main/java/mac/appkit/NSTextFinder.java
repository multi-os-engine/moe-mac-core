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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextFinder extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextFinder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextFinder alloc();

	@Generated
	@Selector("cancelFindIndicator")
	public native void cancelFindIndicator();

	@Generated
	@Selector("client")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object client();

	@Generated
	@Selector("drawIncrementalMatchHighlightInRect:")
	public static native void drawIncrementalMatchHighlightInRect(
			@ByValue CGRect rect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("findBarContainer")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object findBarContainer();

	@Generated
	@Selector("findIndicatorNeedsUpdate")
	public native boolean findIndicatorNeedsUpdate();

	@Generated
	@Selector("incrementalMatchRanges")
	public native NSArray incrementalMatchRanges();

	@Generated
	@Selector("incrementalSearchingShouldDimContentView")
	public native boolean incrementalSearchingShouldDimContentView();

	@Generated
	@Selector("init")
	public native NSTextFinder init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isIncrementalSearchingEnabled")
	public native boolean isIncrementalSearchingEnabled();

	@Generated
	@Selector("noteClientStringWillChange")
	public native void noteClientStringWillChange();

	@Generated
	@Selector("performAction:")
	public native void performAction(long op);

	@Generated
	@Selector("setClient:")
	public native void setClient_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setClient(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) client();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setClient_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setFindBarContainer:")
	public native void setFindBarContainer_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setFindBarContainer(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) findBarContainer();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setFindBarContainer_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setFindIndicatorNeedsUpdate:")
	public native void setFindIndicatorNeedsUpdate(boolean value);

	@Generated
	@Selector("setIncrementalSearchingEnabled:")
	public native void setIncrementalSearchingEnabled(boolean value);

	@Generated
	@Selector("setIncrementalSearchingShouldDimContentView:")
	public native void setIncrementalSearchingShouldDimContentView(boolean value);

	@Generated
	@Selector("validateAction:")
	public native boolean validateAction(long op);
}
