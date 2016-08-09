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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFontManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFontManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Selector("addCollection:options:")
	public native boolean addCollectionOptions(String collectionName,
			long collectionOptions);

	@Generated
	@Selector("addFontDescriptors:toCollection:")
	public native void addFontDescriptorsToCollection(NSArray descriptors,
			String collectionName);

	@Generated
	@Selector("addFontTrait:")
	public native void addFontTrait(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFontManager alloc();

	@Generated
	@Selector("availableFontFamilies")
	public native NSArray availableFontFamilies();

	@Generated
	@Selector("availableFontNamesMatchingFontDescriptor:")
	public native NSArray availableFontNamesMatchingFontDescriptor(
			NSFontDescriptor descriptor);

	@Generated
	@Selector("availableFontNamesWithTraits:")
	public native NSArray availableFontNamesWithTraits(long someTraits);

	@Generated
	@Selector("availableFonts")
	public native NSArray availableFonts();

	@Generated
	@Selector("availableMembersOfFontFamily:")
	public native NSArray availableMembersOfFontFamily(String fam);

	@Generated
	@Selector("collectionNames")
	public native NSArray collectionNames();

	@Generated
	@Selector("convertAttributes:")
	public native NSDictionary convertAttributes(NSDictionary attributes);

	@Generated
	@Selector("convertFont:")
	public native NSFont convertFont(NSFont fontObj);

	@Generated
	@Selector("convertFont:toFace:")
	public native NSFont convertFontToFace(NSFont fontObj, String typeface);

	@Generated
	@Selector("convertFont:toFamily:")
	public native NSFont convertFontToFamily(NSFont fontObj, String family);

	@Generated
	@Selector("convertFont:toHaveTrait:")
	public native NSFont convertFontToHaveTrait(NSFont fontObj, long trait);

	@Generated
	@Selector("convertFont:toNotHaveTrait:")
	public native NSFont convertFontToNotHaveTrait(NSFont fontObj, long trait);

	@Generated
	@Selector("convertFont:toSize:")
	public native NSFont convertFontToSize(NSFont fontObj, double size);

	@Generated
	@Selector("convertFontTraits:")
	public native long convertFontTraits(long traits);

	@Generated
	@Selector("convertWeight:ofFont:")
	public native NSFont convertWeightOfFont(boolean upFlag, NSFont fontObj);

	@Generated
	@Selector("currentFontAction")
	public native long currentFontAction();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("fontDescriptorsInCollection:")
	public native NSArray fontDescriptorsInCollection(String collectionNames);

	@Generated
	@Selector("fontMenu:")
	public native NSMenu fontMenu(boolean create);

	@Generated
	@Selector("fontNamed:hasTraits:")
	public native boolean fontNamedHasTraits(String fName, long someTraits);

	@Generated
	@Selector("fontPanel:")
	public native NSFontPanel fontPanel(boolean create);

	@Generated
	@Selector("fontWithFamily:traits:weight:size:")
	public native NSFont fontWithFamilyTraitsWeightSize(String family,
			long traits, long weight, double size);

	@Generated
	@Selector("init")
	public native NSFontManager init();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("isMultiple")
	public native boolean isMultiple();

	@Generated
	@Selector("localizedNameForFamily:face:")
	public native String localizedNameForFamilyFace(String family,
			String faceKey);

	@Generated
	@Selector("modifyFont:")
	public native void modifyFont(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("modifyFontViaPanel:")
	public native void modifyFontViaPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontFontPanel:")
	public native void orderFrontFontPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontStylesPanel:")
	public native void orderFrontStylesPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("removeCollection:")
	public native boolean removeCollection(String collectionName);

	@Generated
	@Selector("removeFontDescriptor:fromCollection:")
	public native void removeFontDescriptorFromCollection(
			NSFontDescriptor descriptor, String collection);

	@Generated
	@Selector("removeFontTrait:")
	public native void removeFontTrait(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectedFont")
	public native NSFont selectedFont();

	@Generated
	@Selector("sendAction")
	public native boolean sendAction();

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean flag);

	@Generated
	@Selector("setFontManagerFactory:")
	public static native void setFontManagerFactory(Class factoryId);

	@Generated
	@Selector("setFontMenu:")
	public native void setFontMenu(NSMenu newMenu);

	@Generated
	@Selector("setFontPanelFactory:")
	public static native void setFontPanelFactory(Class factoryId);

	@Generated
	@Selector("setSelectedAttributes:isMultiple:")
	public native void setSelectedAttributesIsMultiple(NSDictionary attributes,
			boolean flag);

	@Generated
	@Selector("setSelectedFont:isMultiple:")
	public native void setSelectedFontIsMultiple(NSFont fontObj, boolean flag);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("sharedFontManager")
	public static native NSFontManager sharedFontManager();

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();

	@Generated
	@Selector("traitsOfFont:")
	public native long traitsOfFont(NSFont fontObj);

	@Generated
	@Selector("weightOfFont:")
	public native long weightOfFont(NSFont fontObj);
}
