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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSButtonCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSButtonCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSButtonCell alloc();

	@Generated
	@Selector("alternateImage")
	public native NSImage alternateImage();

	@Generated
	@Selector("alternateMnemonic")
	public native String alternateMnemonic();

	@Generated
	@Selector("alternateMnemonicLocation")
	public native long alternateMnemonicLocation();

	@Generated
	@Selector("alternateTitle")
	public native String alternateTitle();

	@Generated
	@Selector("attributedAlternateTitle")
	public native NSAttributedString attributedAlternateTitle();

	@Generated
	@Selector("attributedTitle")
	public native NSAttributedString attributedTitle();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("bezelStyle")
	public native long bezelStyle();

	@Generated
	@Selector("drawBezelWithFrame:inView:")
	public native void drawBezelWithFrameInView(@ByValue CGRect frame,
			NSView controlView);

	@Generated
	@Selector("drawImage:withFrame:inView:")
	public native void drawImageWithFrameInView(NSImage image,
			@ByValue CGRect frame, NSView controlView);

	@Generated
	@Selector("drawTitle:withFrame:inView:")
	@ByValue
	public native CGRect drawTitleWithFrameInView(NSAttributedString title,
			@ByValue CGRect frame, NSView controlView);

	@Generated
	@Selector("getPeriodicDelay:interval:")
	public native void getPeriodicDelayInterval(FloatPtr delay,
			FloatPtr interval);

	@Generated
	@Selector("gradientType")
	public native long gradientType();

	@Generated
	@Selector("highlightsBy")
	public native long highlightsBy();

	@Generated
	@Selector("imageDimsWhenDisabled")
	public native boolean imageDimsWhenDisabled();

	@Generated
	@Selector("imagePosition")
	public native long imagePosition();

	@Generated
	@Selector("imageScaling")
	public native long imageScaling();

	@Generated
	@Selector("init")
	public native NSButtonCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSButtonCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSButtonCell initTextCell(String aString);

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("isTransparent")
	public native boolean isTransparent();

	@Generated
	@Selector("keyEquivalent")
	public native String keyEquivalent();

	@Generated
	@Selector("keyEquivalentFont")
	public native NSFont keyEquivalentFont();

	@Generated
	@Selector("keyEquivalentModifierMask")
	public native long keyEquivalentModifierMask();

	@Generated
	@Selector("mouseEntered:")
	public native void mouseEntered(NSEvent event);

	@Generated
	@Selector("mouseExited:")
	public native void mouseExited(NSEvent event);

	@Generated
	@Selector("performClick:")
	public native void performClick(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setAlternateImage:")
	public native void setAlternateImage(NSImage image);

	@Generated
	@Selector("setAlternateMnemonicLocation:")
	public native void setAlternateMnemonicLocation(long location);

	@Generated
	@Selector("setAlternateTitle:")
	public native void setAlternateTitle(String aString);

	@Generated
	@Selector("setAlternateTitleWithMnemonic:")
	public native void setAlternateTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setAttributedAlternateTitle:")
	public native void setAttributedAlternateTitle(NSAttributedString obj);

	@Generated
	@Selector("setAttributedTitle:")
	public native void setAttributedTitle(NSAttributedString obj);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBezelStyle:")
	public native void setBezelStyle(long bezelStyle);

	@Generated
	@Selector("setButtonType:")
	public native void setButtonType(long aType);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont fontObj);

	@Generated
	@Selector("setGradientType:")
	public native void setGradientType(long type);

	@Generated
	@Selector("setHighlightsBy:")
	public native void setHighlightsBy(long aType);

	@Generated
	@Selector("setImageDimsWhenDisabled:")
	public native void setImageDimsWhenDisabled(boolean flag);

	@Generated
	@Selector("setImagePosition:")
	public native void setImagePosition(long aPosition);

	@Generated
	@Selector("setImageScaling:")
	public native void setImageScaling(long scaling);

	@Generated
	@Selector("setKeyEquivalent:")
	public native void setKeyEquivalent(String aKeyEquivalent);

	@Generated
	@Selector("setKeyEquivalentFont:")
	public native void setKeyEquivalentFont(NSFont fontObj);

	@Generated
	@Selector("setKeyEquivalentFont:size:")
	public native void setKeyEquivalentFontSize(String fontName, double fontSize);

	@Generated
	@Selector("setKeyEquivalentModifierMask:")
	public native void setKeyEquivalentModifierMask(long mask);

	@Generated
	@Selector("setPeriodicDelay:interval:")
	public native void setPeriodicDelayInterval(float delay, float interval);

	@Generated
	@Selector("setShowsBorderOnlyWhileMouseInside:")
	public native void setShowsBorderOnlyWhileMouseInside(boolean show);

	@Generated
	@Selector("setShowsStateBy:")
	public native void setShowsStateBy(long aType);

	@Generated
	@Selector("setSound:")
	public native void setSound(NSSound aSound);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setTransparent:")
	public native void setTransparent(boolean flag);

	@Generated
	@Selector("showsBorderOnlyWhileMouseInside")
	public native boolean showsBorderOnlyWhileMouseInside();

	@Generated
	@Selector("showsStateBy")
	public native long showsStateBy();

	@Generated
	@Selector("sound")
	public native NSSound sound();

	@Generated
	@Selector("title")
	public native String title();
}
