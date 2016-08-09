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
//  Globals.m
//

#import <_types/_uint16_t.h>
#import <_types/_uint32_t.h>
#import <_types/_uint64_t.h>
#import <ctype.h>
#import <dispatch/dispatch.h>
#import <i386/_types.h>
#import <libkern/OSAtomic.h>
#import <libkern/OSByteOrder.h>
#import <math.h>
#import <signal.h>
#import <stdio.h>
#import <sys/_types/_fd_def.h>
#import <sys/_types/_uintptr_t.h>
#import <xpc/xpc.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT __uint16_t __natj_inline__OSSwapInt16(__uint16_t _data) {
	return _OSSwapInt16(_data);
}

EXPORT __uint32_t __natj_inline__OSSwapInt32(__uint32_t _data) {
	return _OSSwapInt32(_data);
}

EXPORT __uint64_t __natj_inline__OSSwapInt64(__uint64_t _data) {
	return _OSSwapInt64(_data);
}

EXPORT int __natj_inline___darwin_fd_isset(int _n, const struct fd_set * _p) {
	return __darwin_fd_isset(_n, _p);
}

EXPORT int __natj_inline_isascii(int _c) {
	return isascii(_c);
}

EXPORT int __natj_inline___istype(__darwin_ct_rune_t _c, unsigned long _f) {
	return __istype(_c, _f);
}

EXPORT __darwin_ct_rune_t __natj_inline___isctype(__darwin_ct_rune_t _c, unsigned long _f) {
	return __isctype(_c, _f);
}

EXPORT int __natj_inline___wcwidth(__darwin_ct_rune_t _c) {
	return __wcwidth(_c);
}

EXPORT int __natj_inline_isalnum(int _c) {
	return isalnum(_c);
}

EXPORT int __natj_inline_isalpha(int _c) {
	return isalpha(_c);
}

EXPORT int __natj_inline_isblank(int _c) {
	return isblank(_c);
}

EXPORT int __natj_inline_iscntrl(int _c) {
	return iscntrl(_c);
}

EXPORT int __natj_inline_isdigit(int _c) {
	return isdigit(_c);
}

EXPORT int __natj_inline_isgraph(int _c) {
	return isgraph(_c);
}

EXPORT int __natj_inline_islower(int _c) {
	return islower(_c);
}

EXPORT int __natj_inline_isprint(int _c) {
	return isprint(_c);
}

EXPORT int __natj_inline_ispunct(int _c) {
	return ispunct(_c);
}

EXPORT int __natj_inline_isspace(int _c) {
	return isspace(_c);
}

EXPORT int __natj_inline_isupper(int _c) {
	return isupper(_c);
}

EXPORT int __natj_inline_isxdigit(int _c) {
	return isxdigit(_c);
}

EXPORT int __natj_inline_toascii(int _c) {
	return toascii(_c);
}

EXPORT int __natj_inline_tolower(int _c) {
	return tolower(_c);
}

EXPORT int __natj_inline_toupper(int _c) {
	return toupper(_c);
}

EXPORT int __natj_inline_digittoint(int _c) {
	return digittoint(_c);
}

EXPORT int __natj_inline_ishexnumber(int _c) {
	return ishexnumber(_c);
}

EXPORT int __natj_inline_isideogram(int _c) {
	return isideogram(_c);
}

EXPORT int __natj_inline_isnumber(int _c) {
	return isnumber(_c);
}

EXPORT int __natj_inline_isphonogram(int _c) {
	return isphonogram(_c);
}

EXPORT int __natj_inline_isrune(int _c) {
	return isrune(_c);
}

EXPORT int __natj_inline_isspecial(int _c) {
	return isspecial(_c);
}

EXPORT int __natj_inline___inline_isfinitef(float arg1) {
	return __inline_isfinitef(arg1);
}

EXPORT int __natj_inline___inline_isfinited(double arg1) {
	return __inline_isfinited(arg1);
}

EXPORT int __natj_inline___inline_isfinitel(long double arg1) {
	return __inline_isfinitel(arg1);
}

EXPORT int __natj_inline___inline_isinff(float arg1) {
	return __inline_isinff(arg1);
}

EXPORT int __natj_inline___inline_isinfd(double arg1) {
	return __inline_isinfd(arg1);
}

EXPORT int __natj_inline___inline_isinfl(long double arg1) {
	return __inline_isinfl(arg1);
}

EXPORT int __natj_inline___inline_isnanf(float arg1) {
	return __inline_isnanf(arg1);
}

EXPORT int __natj_inline___inline_isnand(double arg1) {
	return __inline_isnand(arg1);
}

EXPORT int __natj_inline___inline_isnanl(long double arg1) {
	return __inline_isnanl(arg1);
}

EXPORT int __natj_inline___inline_isnormalf(float arg1) {
	return __inline_isnormalf(arg1);
}

EXPORT int __natj_inline___inline_isnormald(double arg1) {
	return __inline_isnormald(arg1);
}

EXPORT int __natj_inline___inline_isnormall(long double arg1) {
	return __inline_isnormall(arg1);
}

EXPORT int __natj_inline___inline_signbitf(float arg1) {
	return __inline_signbitf(arg1);
}

EXPORT int __natj_inline___inline_signbitd(double arg1) {
	return __inline_signbitd(arg1);
}

EXPORT int __natj_inline___inline_signbitl(long double arg1) {
	return __inline_signbitl(arg1);
}

EXPORT int __natj_inline___sigbits(int __signo) {
	return __sigbits(__signo);
}

EXPORT int __natj_inline___sputc(int _c, FILE * _p) {
	return __sputc(_c, _p);
}

EXPORT uint16_t __natj_inline_OSReadSwapInt16(const volatile void * base, uintptr_t byteOffset) {
	return OSReadSwapInt16(base, byteOffset);
}

EXPORT uint32_t __natj_inline_OSReadSwapInt32(const volatile void * base, uintptr_t byteOffset) {
	return OSReadSwapInt32(base, byteOffset);
}

EXPORT uint64_t __natj_inline_OSReadSwapInt64(const volatile void * base, uintptr_t byteOffset) {
	return OSReadSwapInt64(base, byteOffset);
}

EXPORT void __natj_inline_OSWriteSwapInt16(volatile void * base, uintptr_t byteOffset, uint16_t data) {
	OSWriteSwapInt16(base, byteOffset, data);
}

EXPORT void __natj_inline_OSWriteSwapInt32(volatile void * base, uintptr_t byteOffset, uint32_t data) {
	OSWriteSwapInt32(base, byteOffset, data);
}

EXPORT void __natj_inline_OSWriteSwapInt64(volatile void * base, uintptr_t byteOffset, uint64_t data) {
	OSWriteSwapInt64(base, byteOffset, data);
}

EXPORT int32_t __natj_inline_OSHostByteOrder() {
	return OSHostByteOrder();
}

EXPORT uint16_t __natj_inline__OSReadInt16(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt16(base, byteOffset);
}

EXPORT uint32_t __natj_inline__OSReadInt32(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt32(base, byteOffset);
}

EXPORT uint64_t __natj_inline__OSReadInt64(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt64(base, byteOffset);
}

EXPORT void __natj_inline__OSWriteInt16(volatile void * base, uintptr_t byteOffset, uint16_t data) {
	_OSWriteInt16(base, byteOffset, data);
}

EXPORT void __natj_inline__OSWriteInt32(volatile void * base, uintptr_t byteOffset, uint32_t data) {
	_OSWriteInt32(base, byteOffset, data);
}

EXPORT void __natj_inline__OSWriteInt64(volatile void * base, uintptr_t byteOffset, uint64_t data) {
	_OSWriteInt64(base, byteOffset, data);
}

EXPORT void __natj_inline__dispatch_object_validate(dispatch_object_t object) {
	_dispatch_object_validate(object);
}

EXPORT void __natj_inline__dispatch_once(dispatch_once_t * predicate, dispatch_block_t block) {
	_dispatch_once(predicate, block);
}

EXPORT void __natj_inline__dispatch_once_f(dispatch_once_t * predicate, void * context, dispatch_function_t function) {
	_dispatch_once_f(predicate, context, function);
}

EXPORT void __natj_inline__xpc_object_validate(xpc_object_t object) {
	_xpc_object_validate(object);
}

EXPORT int32_t __natj_inline_OSAtomicIncrement32(volatile int32_t * __theValue) {
	return OSAtomicIncrement32(__theValue);
}

EXPORT int32_t __natj_inline_OSAtomicIncrement32Barrier(volatile int32_t * __theValue) {
	return OSAtomicIncrement32Barrier(__theValue);
}

EXPORT int32_t __natj_inline_OSAtomicDecrement32(volatile int32_t * __theValue) {
	return OSAtomicDecrement32(__theValue);
}

EXPORT int32_t __natj_inline_OSAtomicDecrement32Barrier(volatile int32_t * __theValue) {
	return OSAtomicDecrement32Barrier(__theValue);
}

EXPORT int64_t __natj_inline_OSAtomicIncrement64(volatile int64_t * __theValue) {
	return OSAtomicIncrement64(__theValue);
}

EXPORT int64_t __natj_inline_OSAtomicIncrement64Barrier(volatile int64_t * __theValue) {
	return OSAtomicIncrement64Barrier(__theValue);
}

EXPORT int64_t __natj_inline_OSAtomicDecrement64(volatile int64_t * __theValue) {
	return OSAtomicDecrement64(__theValue);
}

EXPORT int64_t __natj_inline_OSAtomicDecrement64Barrier(volatile int64_t * __theValue) {
	return OSAtomicDecrement64Barrier(__theValue);
}


