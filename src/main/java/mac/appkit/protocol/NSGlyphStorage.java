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


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSGlyphStorage")
public interface NSGlyphStorage {
	@Generated
	@Selector("attributedString")
	public NSAttributedString attributedString();

	@Generated
	@Selector("insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:")
	public void insertGlyphsLengthForStartingGlyphAtIndexCharacterIndex(
			ConstIntPtr glyphs, long length, long glyphIndex, long charIndex);

	@Generated
	@Selector("layoutOptions")
	public long layoutOptions();

	@Generated
	@Selector("setIntAttribute:value:forGlyphAtIndex:")
	public void setIntAttributeValueForGlyphAtIndex(long attributeTag,
			long val, long glyphIndex);
}
