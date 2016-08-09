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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSButtonCell;
import mac.appkit.NSColorList;
import mac.appkit.NSColorPanel;
import mac.appkit.NSImage;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSColorPickingDefault")
public interface NSColorPickingDefault {
	@Generated
	@Selector("alphaControlAddedOrRemoved:")
	public void alphaControlAddedOrRemoved(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("attachColorList:")
	public void attachColorList(NSColorList colorList);

	@Generated
	@Selector("buttonToolTip")
	public String buttonToolTip();

	@Generated
	@Selector("detachColorList:")
	public void detachColorList(NSColorList colorList);

	@Generated
	@Selector("initWithPickerMask:colorPanel:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object initWithPickerMaskColorPanel(long mask,
			NSColorPanel owningColorPanel);

	@Generated
	@Selector("insertNewButtonImage:in:")
	public void insertNewButtonImageIn(NSImage newButtonImage,
			NSButtonCell buttonCell);

	@Generated
	@Selector("minContentSize")
	@ByValue
	public CGSize minContentSize();

	@Generated
	@Selector("provideNewButtonImage")
	public NSImage provideNewButtonImage();

	@Generated
	@Selector("setMode:")
	public void setMode(long mode);

	@Generated
	@Selector("viewSizeChanged:")
	public void viewSizeChanged(@Mapped(ObjCObjectMapper.class) Object sender);
}
