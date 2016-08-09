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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSTextFinderBarContainer;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScrollView extends NSView implements NSTextFinderBarContainer {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScrollView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addFloatingSubview:forAxis:")
	public native void addFloatingSubviewForAxis(NSView view, long axis);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScrollView alloc();

	@Generated
	@Selector("allowsMagnification")
	public native boolean allowsMagnification();

	@Generated
	@Selector("autohidesScrollers")
	public native boolean autohidesScrollers();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("borderType")
	public native long borderType();

	@Generated
	@Selector("contentSize")
	@ByValue
	public native CGSize contentSize();

	@Generated
	@Selector("contentSizeForFrameSize:hasHorizontalScroller:hasVerticalScroller:borderType:")
	@ByValue
	public static native CGSize contentSizeForFrameSizeHasHorizontalScrollerHasVerticalScrollerBorderType(
			@ByValue CGSize fSize, boolean hFlag, boolean vFlag, long aType);

	@Generated
	@Selector("contentSizeForFrameSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:")
	@ByValue
	public static native CGSize contentSizeForFrameSizeHorizontalScrollerClassVerticalScrollerClassBorderTypeControlSizeScrollerStyle(
			@ByValue CGSize fSize, Class horizontalScrollerClass,
			Class verticalScrollerClass, long aType, long controlSize,
			long scrollerStyle);

	@Generated
	@Selector("contentView")
	public native NSClipView contentView();

	@Generated
	@Selector("documentCursor")
	public native NSCursor documentCursor();

	@Generated
	@Selector("documentView")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object documentView();

	@Generated
	@Selector("documentVisibleRect")
	@ByValue
	public native CGRect documentVisibleRect();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("findBarPosition")
	public native long findBarPosition();

	@Generated
	@Selector("findBarView")
	public native NSView findBarView();

	@Generated
	@Selector("findBarViewDidChangeHeight")
	public native void findBarViewDidChangeHeight();

	@Generated
	@Selector("flashScrollers")
	public native void flashScrollers();

	@Generated
	@Selector("frameSizeForContentSize:hasHorizontalScroller:hasVerticalScroller:borderType:")
	@ByValue
	public static native CGSize frameSizeForContentSizeHasHorizontalScrollerHasVerticalScrollerBorderType(
			@ByValue CGSize cSize, boolean hFlag, boolean vFlag, long aType);

	@Generated
	@Selector("frameSizeForContentSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:")
	@ByValue
	public static native CGSize frameSizeForContentSizeHorizontalScrollerClassVerticalScrollerClassBorderTypeControlSizeScrollerStyle(
			@ByValue CGSize cSize, Class horizontalScrollerClass,
			Class verticalScrollerClass, long aType, long controlSize,
			long scrollerStyle);

	@Generated
	@Selector("hasHorizontalRuler")
	public native boolean hasHorizontalRuler();

	@Generated
	@Selector("hasHorizontalScroller")
	public native boolean hasHorizontalScroller();

	@Generated
	@Selector("hasVerticalRuler")
	public native boolean hasVerticalRuler();

	@Generated
	@Selector("hasVerticalScroller")
	public native boolean hasVerticalScroller();

	@Generated
	@Selector("horizontalLineScroll")
	public native double horizontalLineScroll();

	@Generated
	@Selector("horizontalPageScroll")
	public native double horizontalPageScroll();

	@Generated
	@Selector("horizontalRulerView")
	public native NSRulerView horizontalRulerView();

	@Generated
	@Selector("horizontalScrollElasticity")
	public native long horizontalScrollElasticity();

	@Generated
	@Selector("horizontalScroller")
	public native NSScroller horizontalScroller();

	@Generated
	@Selector("init")
	public native NSScrollView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSScrollView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isFindBarVisible")
	public native boolean isFindBarVisible();

	@Generated
	@Selector("lineScroll")
	public native double lineScroll();

	@Generated
	@Selector("magnification")
	public native double magnification();

	@Generated
	@Selector("magnifyToFitRect:")
	public native void magnifyToFitRect(@ByValue CGRect rect);

	@Generated
	@Selector("maxMagnification")
	public native double maxMagnification();

	@Generated
	@Selector("minMagnification")
	public native double minMagnification();

	@Generated
	@Selector("pageScroll")
	public native double pageScroll();

	@Generated
	@Selector("reflectScrolledClipView:")
	public native void reflectScrolledClipView(NSClipView cView);

	@Generated
	@Selector("rulerViewClass")
	public static native Class rulerViewClass();

	@Generated
	@Selector("rulersVisible")
	public native boolean rulersVisible();

	@Generated
	@Selector("scrollWheel:")
	public native void scrollWheel(NSEvent theEvent);

	@Generated
	@Selector("scrollerKnobStyle")
	public native long scrollerKnobStyle();

	@Generated
	@Selector("scrollerStyle")
	public native long scrollerStyle();

	@Generated
	@Selector("scrollsDynamically")
	public native boolean scrollsDynamically();

	@Generated
	@Selector("setAllowsMagnification:")
	public native void setAllowsMagnification(boolean value);

	@Generated
	@Selector("setAutohidesScrollers:")
	public native void setAutohidesScrollers(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBorderType:")
	public native void setBorderType(long aType);

	@Generated
	@Selector("setContentView:")
	public native void setContentView(NSClipView contentView);

	@Generated
	@Selector("setDocumentCursor:")
	public native void setDocumentCursor(NSCursor anObj);

	@Generated
	@Selector("setDocumentView:")
	public native void setDocumentView(NSView aView);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setFindBarPosition:")
	public native void setFindBarPosition(long position);

	@Generated
	@Selector("setFindBarView:")
	public native void setFindBarView(NSView value);

	@Generated
	@Selector("setFindBarVisible:")
	public native void setFindBarVisible(boolean value);

	@Generated
	@Selector("setHasHorizontalRuler:")
	public native void setHasHorizontalRuler(boolean flag);

	@Generated
	@Selector("setHasHorizontalScroller:")
	public native void setHasHorizontalScroller(boolean flag);

	@Generated
	@Selector("setHasVerticalRuler:")
	public native void setHasVerticalRuler(boolean flag);

	@Generated
	@Selector("setHasVerticalScroller:")
	public native void setHasVerticalScroller(boolean flag);

	@Generated
	@Selector("setHorizontalLineScroll:")
	public native void setHorizontalLineScroll(double value);

	@Generated
	@Selector("setHorizontalPageScroll:")
	public native void setHorizontalPageScroll(double value);

	@Generated
	@Selector("setHorizontalRulerView:")
	public native void setHorizontalRulerView(NSRulerView ruler);

	@Generated
	@Selector("setHorizontalScrollElasticity:")
	public native void setHorizontalScrollElasticity(long elasticity);

	@Generated
	@Selector("setHorizontalScroller:")
	public native void setHorizontalScroller(NSScroller anObject);

	@Generated
	@Selector("setLineScroll:")
	public native void setLineScroll(double value);

	@Generated
	@Selector("setMagnification:")
	public native void setMagnification(double value);

	@Generated
	@Selector("setMagnification:centeredAtPoint:")
	public native void setMagnificationCenteredAtPoint(double magnification,
			@ByValue CGPoint point);

	@Generated
	@Selector("setMaxMagnification:")
	public native void setMaxMagnification(double value);

	@Generated
	@Selector("setMinMagnification:")
	public native void setMinMagnification(double value);

	@Generated
	@Selector("setPageScroll:")
	public native void setPageScroll(double value);

	@Generated
	@Selector("setRulerViewClass:")
	public static native void setRulerViewClass(Class rulerViewClass);

	@Generated
	@Selector("setRulersVisible:")
	public native void setRulersVisible(boolean flag);

	@Generated
	@Selector("setScrollerKnobStyle:")
	public native void setScrollerKnobStyle(long newScrollerKnobStyle);

	@Generated
	@Selector("setScrollerStyle:")
	public native void setScrollerStyle(long newScrollerStyle);

	@Generated
	@Selector("setScrollsDynamically:")
	public native void setScrollsDynamically(boolean flag);

	@Generated
	@Selector("setUsesPredominantAxisScrolling:")
	public native void setUsesPredominantAxisScrolling(
			boolean predominantAxisScrolling);

	@Generated
	@Selector("setVerticalLineScroll:")
	public native void setVerticalLineScroll(double value);

	@Generated
	@Selector("setVerticalPageScroll:")
	public native void setVerticalPageScroll(double value);

	@Generated
	@Selector("setVerticalRulerView:")
	public native void setVerticalRulerView(NSRulerView ruler);

	@Generated
	@Selector("setVerticalScrollElasticity:")
	public native void setVerticalScrollElasticity(long elasticity);

	@Generated
	@Selector("setVerticalScroller:")
	public native void setVerticalScroller(NSScroller anObject);

	@Generated
	@Selector("tile")
	public native void tile();

	@Generated
	@Selector("usesPredominantAxisScrolling")
	public native boolean usesPredominantAxisScrolling();

	@Generated
	@Selector("verticalLineScroll")
	public native double verticalLineScroll();

	@Generated
	@Selector("verticalPageScroll")
	public native double verticalPageScroll();

	@Generated
	@Selector("verticalRulerView")
	public native NSRulerView verticalRulerView();

	@Generated
	@Selector("verticalScrollElasticity")
	public native long verticalScrollElasticity();

	@Generated
	@Selector("verticalScroller")
	public native NSScroller verticalScroller();
}
