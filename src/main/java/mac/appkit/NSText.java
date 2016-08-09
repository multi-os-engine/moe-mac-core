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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSChangeSpelling;
import mac.appkit.protocol.NSIgnoreMisspelledWords;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSData;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSText extends NSView implements NSChangeSpelling,
		NSIgnoreMisspelledWords {
	static {
		NatJ.register();
	}

	@Generated
	protected NSText(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("RTFDFromRange:")
	public native NSData RTFDFromRange(@ByValue NSRange range);

	@Generated
	@Selector("RTFFromRange:")
	public native NSData RTFFromRange(@ByValue NSRange range);

	@Generated
	@Selector("alignCenter:")
	public native void alignCenter(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("alignLeft:")
	public native void alignLeft(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("alignRight:")
	public native void alignRight(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("alignment")
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSText alloc();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("baseWritingDirection")
	public native long baseWritingDirection();

	@Generated
	@Selector("changeFont:")
	public native void changeFont(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeSpelling:")
	public native void changeSpelling(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("checkSpelling:")
	public native void checkSpelling(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("copy:")
	public native void copy(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("copyFont:")
	public native void copyFont(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("copyRuler:")
	public native void copyRuler(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("cut:")
	public native void cut(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("delete:")
	public native void delete(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("ignoreSpelling:")
	public native void ignoreSpelling(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("importsGraphics")
	public native boolean importsGraphics();

	@Generated
	@Selector("init")
	public native NSText init();

	@Generated
	@Selector("initWithFrame:")
	public native NSText initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("isFieldEditor")
	public native boolean isFieldEditor();

	@Generated
	@Selector("isHorizontallyResizable")
	public native boolean isHorizontallyResizable();

	@Generated
	@Selector("isRichText")
	public native boolean isRichText();

	@Generated
	@Selector("isRulerVisible")
	public native boolean isRulerVisible();

	@Generated
	@Selector("isSelectable")
	public native boolean isSelectable();

	@Generated
	@Selector("isVerticallyResizable")
	public native boolean isVerticallyResizable();

	@Generated
	@Selector("maxSize")
	@ByValue
	public native CGSize maxSize();

	@Generated
	@Selector("minSize")
	@ByValue
	public native CGSize minSize();

	@Generated
	@Selector("paste:")
	public native void paste(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pasteFont:")
	public native void pasteFont(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pasteRuler:")
	public native void pasteRuler(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("readRTFDFromFile:")
	public native boolean readRTFDFromFile(String path);

	@Generated
	@Selector("replaceCharactersInRange:withRTF:")
	public native void replaceCharactersInRangeWithRTF(@ByValue NSRange range,
			NSData rtfData);

	@Generated
	@Selector("replaceCharactersInRange:withRTFD:")
	public native void replaceCharactersInRangeWithRTFD(@ByValue NSRange range,
			NSData rtfdData);

	@Generated
	@Selector("replaceCharactersInRange:withString:")
	public native void replaceCharactersInRangeWithString(
			@ByValue NSRange range, String aString);

	@Generated
	@Selector("scrollRangeToVisible:")
	public native void scrollRangeToVisible(@ByValue NSRange range);

	@Generated
	@Selector("selectAll:")
	public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectedRange")
	@ByValue
	public native NSRange selectedRange();

	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(long mode);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBaseWritingDirection:")
	public native void setBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setFieldEditor:")
	public native void setFieldEditor(boolean flag);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont obj);

	@Generated
	@Selector("setFont:range:")
	public native void setFontRange(NSFont font, @ByValue NSRange range);

	@Generated
	@Selector("setHorizontallyResizable:")
	public native void setHorizontallyResizable(boolean flag);

	@Generated
	@Selector("setImportsGraphics:")
	public native void setImportsGraphics(boolean flag);

	@Generated
	@Selector("setMaxSize:")
	public native void setMaxSize(@ByValue CGSize newMaxSize);

	@Generated
	@Selector("setMinSize:")
	public native void setMinSize(@ByValue CGSize newMinSize);

	@Generated
	@Selector("setRichText:")
	public native void setRichText(boolean flag);

	@Generated
	@Selector("setSelectable:")
	public native void setSelectable(boolean flag);

	@Generated
	@Selector("setSelectedRange:")
	public native void setSelectedRange(@ByValue NSRange range);

	@Generated
	@Selector("setString:")
	public native void setString(String string);

	@Generated
	@Selector("setTextColor:")
	public native void setTextColor(NSColor color);

	@Generated
	@Selector("setTextColor:range:")
	public native void setTextColorRange(NSColor color, @ByValue NSRange range);

	@Generated
	@Selector("setUsesFontPanel:")
	public native void setUsesFontPanel(boolean flag);

	@Generated
	@Selector("setVerticallyResizable:")
	public native void setVerticallyResizable(boolean flag);

	@Generated
	@Selector("showGuessPanel:")
	public native void showGuessPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("string")
	public native String string();

	@Generated
	@Selector("subscript:")
	public native void subscript(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("superscript:")
	public native void superscript(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("textColor")
	public native NSColor textColor();

	@Generated
	@Selector("toggleRuler:")
	public native void toggleRuler(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("underline:")
	public native void underline(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("unscript:")
	public native void unscript(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("usesFontPanel")
	public native boolean usesFontPanel();

	@Generated
	@Selector("writeRTFDToFile:atomically:")
	public native boolean writeRTFDToFileAtomically(String path, boolean flag);
}
