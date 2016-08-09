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

//
//  CoreServices.m
//

#import <Carbon/Carbon.h>
#import <MacTypes.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT Boolean __natj_inline_UCIsSurrogateHighCharacter(UniChar character) {
	return UCIsSurrogateHighCharacter(character);
}

EXPORT Boolean __natj_inline_UCIsSurrogateLowCharacter(UniChar character) {
	return UCIsSurrogateLowCharacter(character);
}

EXPORT UnicodeScalarValue __natj_inline_UCGetUnicodeScalarValueForSurrogatePair(UniChar surrogateHigh, UniChar surrogateLow) {
	return UCGetUnicodeScalarValueForSurrogatePair(surrogateHigh, surrogateLow);
}

EXPORT wide __natj_inline_SInt64ToWide(SInt64 s) {
	return SInt64ToWide(s);
}

EXPORT SInt64 __natj_inline_WideToSInt64(wide w) {
	return WideToSInt64(w);
}

EXPORT UnsignedWide __natj_inline_UInt64ToUnsignedWide(UInt64 u) {
	return UInt64ToUnsignedWide(u);
}

EXPORT UInt64 __natj_inline_UnsignedWideToUInt64(UnsignedWide uw) {
	return UnsignedWideToUInt64(uw);
}


