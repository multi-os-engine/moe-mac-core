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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNumberFormatter extends NSFormatter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNumberFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNumberFormatter alloc();

	@Generated
	@Selector("allowsFloats")
	public native boolean allowsFloats();

	@Generated
	@Selector("alwaysShowsDecimalSeparator")
	public native boolean alwaysShowsDecimalSeparator();

	@Generated
	@Selector("attributedStringForNil")
	public native NSAttributedString attributedStringForNil();

	@Generated
	@Selector("attributedStringForNotANumber")
	public native NSAttributedString attributedStringForNotANumber();

	@Generated
	@Selector("attributedStringForZero")
	public native NSAttributedString attributedStringForZero();

	@Generated
	@Selector("currencyCode")
	public native String currencyCode();

	@Generated
	@Selector("currencyDecimalSeparator")
	public native String currencyDecimalSeparator();

	@Generated
	@Selector("currencyGroupingSeparator")
	public native String currencyGroupingSeparator();

	@Generated
	@Selector("currencySymbol")
	public native String currencySymbol();

	@Generated
	@Selector("decimalSeparator")
	public native String decimalSeparator();

	@Generated
	@Selector("defaultFormatterBehavior")
	public static native long defaultFormatterBehavior();

	@Generated
	@Selector("exponentSymbol")
	public native String exponentSymbol();

	@Generated
	@Selector("format")
	public native String format();

	@Generated
	@Selector("formatWidth")
	public native long formatWidth();

	@Generated
	@Selector("formatterBehavior")
	public native long formatterBehavior();

	@Generated
	@Selector("generatesDecimalNumbers")
	public native boolean generatesDecimalNumbers();

	@Generated
	@Selector("getObjectValue:forString:range:error:")
	public native boolean getObjectValueForStringRangeError(
			Ptr<? extends ObjCObject> obj,
			String string,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange rangep,
			Ptr<NSError> error);

	@Generated
	@Selector("groupingSeparator")
	public native String groupingSeparator();

	@Generated
	@Selector("groupingSize")
	public native long groupingSize();

	@Generated
	@Selector("hasThousandSeparators")
	public native boolean hasThousandSeparators();

	@Generated
	@Selector("init")
	public native NSNumberFormatter init();

	@Generated
	@Selector("internationalCurrencySymbol")
	public native String internationalCurrencySymbol();

	@Generated
	@Selector("isLenient")
	public native boolean isLenient();

	@Generated
	@Selector("isPartialStringValidationEnabled")
	public native boolean isPartialStringValidationEnabled();

	@Generated
	@Selector("locale")
	public native NSLocale locale();

	@Generated
	@Selector("localizedStringFromNumber:numberStyle:")
	public static native String localizedStringFromNumberNumberStyle(
			NSNumber num, long nstyle);

	@Generated
	@Selector("localizesFormat")
	public native boolean localizesFormat();

	@Generated
	@Selector("maximum")
	public native NSNumber maximum();

	@Generated
	@Selector("maximumFractionDigits")
	public native long maximumFractionDigits();

	@Generated
	@Selector("maximumIntegerDigits")
	public native long maximumIntegerDigits();

	@Generated
	@Selector("maximumSignificantDigits")
	public native long maximumSignificantDigits();

	@Generated
	@Selector("minimum")
	public native NSNumber minimum();

	@Generated
	@Selector("minimumFractionDigits")
	public native long minimumFractionDigits();

	@Generated
	@Selector("minimumIntegerDigits")
	public native long minimumIntegerDigits();

	@Generated
	@Selector("minimumSignificantDigits")
	public native long minimumSignificantDigits();

	@Generated
	@Selector("minusSign")
	public native String minusSign();

	@Generated
	@Selector("multiplier")
	public native NSNumber multiplier();

	@Generated
	@Selector("negativeFormat")
	public native String negativeFormat();

	@Generated
	@Selector("negativeInfinitySymbol")
	public native String negativeInfinitySymbol();

	@Generated
	@Selector("negativePrefix")
	public native String negativePrefix();

	@Generated
	@Selector("negativeSuffix")
	public native String negativeSuffix();

	@Generated
	@Selector("nilSymbol")
	public native String nilSymbol();

	@Generated
	@Selector("notANumberSymbol")
	public native String notANumberSymbol();

	@Generated
	@Selector("numberFromString:")
	public native NSNumber numberFromString(String string);

	@Generated
	@Selector("numberStyle")
	public native long numberStyle();

	@Generated
	@Selector("paddingCharacter")
	public native String paddingCharacter();

	@Generated
	@Selector("paddingPosition")
	public native long paddingPosition();

	@Generated
	@Selector("perMillSymbol")
	public native String perMillSymbol();

	@Generated
	@Selector("percentSymbol")
	public native String percentSymbol();

	@Generated
	@Selector("plusSign")
	public native String plusSign();

	@Generated
	@Selector("positiveFormat")
	public native String positiveFormat();

	@Generated
	@Selector("positiveInfinitySymbol")
	public native String positiveInfinitySymbol();

	@Generated
	@Selector("positivePrefix")
	public native String positivePrefix();

	@Generated
	@Selector("positiveSuffix")
	public native String positiveSuffix();

	@Generated
	@Selector("roundingBehavior")
	public native NSDecimalNumberHandler roundingBehavior();

	@Generated
	@Selector("roundingIncrement")
	public native NSNumber roundingIncrement();

	@Generated
	@Selector("roundingMode")
	public native long roundingMode();

	@Generated
	@Selector("secondaryGroupingSize")
	public native long secondaryGroupingSize();

	@Generated
	@Selector("setAllowsFloats:")
	public native void setAllowsFloats(boolean flag);

	@Generated
	@Selector("setAlwaysShowsDecimalSeparator:")
	public native void setAlwaysShowsDecimalSeparator(boolean b);

	@Generated
	@Selector("setAttributedStringForNil:")
	public native void setAttributedStringForNil(
			NSAttributedString newAttributedString);

	@Generated
	@Selector("setAttributedStringForNotANumber:")
	public native void setAttributedStringForNotANumber(
			NSAttributedString newAttributedString);

	@Generated
	@Selector("setAttributedStringForZero:")
	public native void setAttributedStringForZero(
			NSAttributedString newAttributedString);

	@Generated
	@Selector("setCurrencyCode:")
	public native void setCurrencyCode(String string);

	@Generated
	@Selector("setCurrencyDecimalSeparator:")
	public native void setCurrencyDecimalSeparator(String string);

	@Generated
	@Selector("setCurrencyGroupingSeparator:")
	public native void setCurrencyGroupingSeparator(String string);

	@Generated
	@Selector("setCurrencySymbol:")
	public native void setCurrencySymbol(String string);

	@Generated
	@Selector("setDecimalSeparator:")
	public native void setDecimalSeparator(String string);

	@Generated
	@Selector("setDefaultFormatterBehavior:")
	public static native void setDefaultFormatterBehavior(long behavior);

	@Generated
	@Selector("setExponentSymbol:")
	public native void setExponentSymbol(String string);

	@Generated
	@Selector("setFormat:")
	public native void setFormat(String string);

	@Generated
	@Selector("setFormatWidth:")
	public native void setFormatWidth(long number);

	@Generated
	@Selector("setFormatterBehavior:")
	public native void setFormatterBehavior(long behavior);

	@Generated
	@Selector("setGeneratesDecimalNumbers:")
	public native void setGeneratesDecimalNumbers(boolean b);

	@Generated
	@Selector("setGroupingSeparator:")
	public native void setGroupingSeparator(String string);

	@Generated
	@Selector("setGroupingSize:")
	public native void setGroupingSize(long number);

	@Generated
	@Selector("setHasThousandSeparators:")
	public native void setHasThousandSeparators(boolean flag);

	@Generated
	@Selector("setInternationalCurrencySymbol:")
	public native void setInternationalCurrencySymbol(String string);

	@Generated
	@Selector("setLenient:")
	public native void setLenient(boolean b);

	@Generated
	@Selector("setLocale:")
	public native void setLocale(NSLocale locale);

	@Generated
	@Selector("setLocalizesFormat:")
	public native void setLocalizesFormat(boolean flag);

	@Generated
	@Selector("setMaximum:")
	public native void setMaximum(NSNumber number);

	@Generated
	@Selector("setMaximumFractionDigits:")
	public native void setMaximumFractionDigits(long number);

	@Generated
	@Selector("setMaximumIntegerDigits:")
	public native void setMaximumIntegerDigits(long number);

	@Generated
	@Selector("setMaximumSignificantDigits:")
	public native void setMaximumSignificantDigits(long number);

	@Generated
	@Selector("setMinimum:")
	public native void setMinimum(NSNumber number);

	@Generated
	@Selector("setMinimumFractionDigits:")
	public native void setMinimumFractionDigits(long number);

	@Generated
	@Selector("setMinimumIntegerDigits:")
	public native void setMinimumIntegerDigits(long number);

	@Generated
	@Selector("setMinimumSignificantDigits:")
	public native void setMinimumSignificantDigits(long number);

	@Generated
	@Selector("setMinusSign:")
	public native void setMinusSign(String string);

	@Generated
	@Selector("setMultiplier:")
	public native void setMultiplier(NSNumber number);

	@Generated
	@Selector("setNegativeFormat:")
	public native void setNegativeFormat(String format);

	@Generated
	@Selector("setNegativeInfinitySymbol:")
	public native void setNegativeInfinitySymbol(String string);

	@Generated
	@Selector("setNegativePrefix:")
	public native void setNegativePrefix(String string);

	@Generated
	@Selector("setNegativeSuffix:")
	public native void setNegativeSuffix(String string);

	@Generated
	@Selector("setNilSymbol:")
	public native void setNilSymbol(String string);

	@Generated
	@Selector("setNotANumberSymbol:")
	public native void setNotANumberSymbol(String string);

	@Generated
	@Selector("setNumberStyle:")
	public native void setNumberStyle(long style);

	@Generated
	@Selector("setPaddingCharacter:")
	public native void setPaddingCharacter(String string);

	@Generated
	@Selector("setPaddingPosition:")
	public native void setPaddingPosition(long position);

	@Generated
	@Selector("setPartialStringValidationEnabled:")
	public native void setPartialStringValidationEnabled(boolean b);

	@Generated
	@Selector("setPerMillSymbol:")
	public native void setPerMillSymbol(String string);

	@Generated
	@Selector("setPercentSymbol:")
	public native void setPercentSymbol(String string);

	@Generated
	@Selector("setPlusSign:")
	public native void setPlusSign(String string);

	@Generated
	@Selector("setPositiveFormat:")
	public native void setPositiveFormat(String format);

	@Generated
	@Selector("setPositiveInfinitySymbol:")
	public native void setPositiveInfinitySymbol(String string);

	@Generated
	@Selector("setPositivePrefix:")
	public native void setPositivePrefix(String string);

	@Generated
	@Selector("setPositiveSuffix:")
	public native void setPositiveSuffix(String string);

	@Generated
	@Selector("setRoundingBehavior:")
	public native void setRoundingBehavior(
			NSDecimalNumberHandler newRoundingBehavior);

	@Generated
	@Selector("setRoundingIncrement:")
	public native void setRoundingIncrement(NSNumber number);

	@Generated
	@Selector("setRoundingMode:")
	public native void setRoundingMode(long mode);

	@Generated
	@Selector("setSecondaryGroupingSize:")
	public native void setSecondaryGroupingSize(long number);

	@Generated
	@Selector("setTextAttributesForNegativeInfinity:")
	public native void setTextAttributesForNegativeInfinity(
			NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForNegativeValues:")
	public native void setTextAttributesForNegativeValues(
			NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForNil:")
	public native void setTextAttributesForNil(NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForNotANumber:")
	public native void setTextAttributesForNotANumber(NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForPositiveInfinity:")
	public native void setTextAttributesForPositiveInfinity(
			NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForPositiveValues:")
	public native void setTextAttributesForPositiveValues(
			NSDictionary newAttributes);

	@Generated
	@Selector("setTextAttributesForZero:")
	public native void setTextAttributesForZero(NSDictionary newAttributes);

	@Generated
	@Selector("setThousandSeparator:")
	public native void setThousandSeparator(String newSeparator);

	@Generated
	@Selector("setUsesGroupingSeparator:")
	public native void setUsesGroupingSeparator(boolean b);

	@Generated
	@Selector("setUsesSignificantDigits:")
	public native void setUsesSignificantDigits(boolean b);

	@Generated
	@Selector("setZeroSymbol:")
	public native void setZeroSymbol(String string);

	@Generated
	@Selector("stringFromNumber:")
	public native String stringFromNumber(NSNumber number);

	@Generated
	@Selector("textAttributesForNegativeInfinity")
	public native NSDictionary textAttributesForNegativeInfinity();

	@Generated
	@Selector("textAttributesForNegativeValues")
	public native NSDictionary textAttributesForNegativeValues();

	@Generated
	@Selector("textAttributesForNil")
	public native NSDictionary textAttributesForNil();

	@Generated
	@Selector("textAttributesForNotANumber")
	public native NSDictionary textAttributesForNotANumber();

	@Generated
	@Selector("textAttributesForPositiveInfinity")
	public native NSDictionary textAttributesForPositiveInfinity();

	@Generated
	@Selector("textAttributesForPositiveValues")
	public native NSDictionary textAttributesForPositiveValues();

	@Generated
	@Selector("textAttributesForZero")
	public native NSDictionary textAttributesForZero();

	@Generated
	@Selector("thousandSeparator")
	public native String thousandSeparator();

	@Generated
	@Selector("usesGroupingSeparator")
	public native boolean usesGroupingSeparator();

	@Generated
	@Selector("usesSignificantDigits")
	public native boolean usesSignificantDigits();

	@Generated
	@Selector("zeroSymbol")
	public native String zeroSymbol();
}
