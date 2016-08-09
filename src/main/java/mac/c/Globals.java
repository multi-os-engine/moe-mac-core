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

package mac.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.opaque.dispatch_source_type_t;
import mac.opaque.xpc_type_t;
import mac.struct.*;
import mac.sys.struct.*;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
	static {
		NatJ.register();
	}

	@Generated
	private Globals() {
	}

	@Generated
	@Inline
	@CFunction
	public static native short _OSSwapInt16(short _data);

	@Generated
	@Inline
	@CFunction
	public static native int _OSSwapInt32(int _data);

	@Generated
	@Inline
	@CFunction
	public static native long _OSSwapInt64(long _data);

	@Generated
	@CFunction
	public static native void __assert_rtn(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			int arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

	@Generated
	@CFunction
	public static native long ___runetype(int arg1);

	@Generated
	@CFunction
	public static native int ___tolower(int arg1);

	@Generated
	@CFunction
	public static native int ___toupper(int arg1);

	@Generated
	@Inline
	@CFunction
	public static native int isascii(int _c);

	@Generated
	@CFunction
	public static native int __maskrune(int arg1, long arg2);

	@Generated
	@Inline
	@CFunction
	public static native int __istype(int _c, long _f);

	@Generated
	@Inline
	@CFunction
	public static native int __isctype(int _c, long _f);

	@Generated
	@CFunction
	public static native int __toupper(int arg1);

	@Generated
	@CFunction
	public static native int __tolower(int arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __wcwidth(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isalnum(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isalpha(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isblank(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int iscntrl(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isdigit(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isgraph(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int islower(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isprint(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int ispunct(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isspace(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isupper(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isxdigit(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int toascii(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int tolower(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int toupper(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int digittoint(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int ishexnumber(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isideogram(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isnumber(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isphonogram(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isrune(int _c);

	@Generated
	@Inline
	@CFunction
	public static native int isspecial(int _c);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native lconv localeconv();

	@Generated
	@CFunction
	public static native BytePtr setlocale(
			int arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int __math_errhandling();

	@Generated
	@CFunction
	public static native int __fpclassifyf(float arg1);

	@Generated
	@CFunction
	public static native int __fpclassifyd(double arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isfinitef(float arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isfinited(double arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isinff(float arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isinfd(double arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isnanf(float arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isnand(double arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isnormalf(float arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_isnormald(double arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_signbitf(float arg1);

	@Generated
	@Inline
	@CFunction
	public static native int __inline_signbitd(double arg1);

	@Generated
	@CFunction
	public static native float acosf(float arg1);

	@Generated
	@CFunction
	public static native double acos(double arg1);

	@Generated
	@CFunction
	public static native float asinf(float arg1);

	@Generated
	@CFunction
	public static native double asin(double arg1);

	@Generated
	@CFunction
	public static native float atanf(float arg1);

	@Generated
	@CFunction
	public static native double atan(double arg1);

	@Generated
	@CFunction
	public static native float atan2f(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double atan2(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float cosf(float arg1);

	@Generated
	@CFunction
	public static native double cos(double arg1);

	@Generated
	@CFunction
	public static native float sinf(float arg1);

	@Generated
	@CFunction
	public static native double sin(double arg1);

	@Generated
	@CFunction
	public static native float tanf(float arg1);

	@Generated
	@CFunction
	public static native double tan(double arg1);

	@Generated
	@CFunction
	public static native float acoshf(float arg1);

	@Generated
	@CFunction
	public static native double acosh(double arg1);

	@Generated
	@CFunction
	public static native float asinhf(float arg1);

	@Generated
	@CFunction
	public static native double asinh(double arg1);

	@Generated
	@CFunction
	public static native float atanhf(float arg1);

	@Generated
	@CFunction
	public static native double atanh(double arg1);

	@Generated
	@CFunction
	public static native float coshf(float arg1);

	@Generated
	@CFunction
	public static native double cosh(double arg1);

	@Generated
	@CFunction
	public static native float sinhf(float arg1);

	@Generated
	@CFunction
	public static native double sinh(double arg1);

	@Generated
	@CFunction
	public static native float tanhf(float arg1);

	@Generated
	@CFunction
	public static native double tanh(double arg1);

	@Generated
	@CFunction
	public static native float expf(float arg1);

	@Generated
	@CFunction
	public static native double exp(double arg1);

	@Generated
	@CFunction
	public static native float exp2f(float arg1);

	@Generated
	@CFunction
	public static native double exp2(double arg1);

	@Generated
	@CFunction
	public static native float expm1f(float arg1);

	@Generated
	@CFunction
	public static native double expm1(double arg1);

	@Generated
	@CFunction
	public static native float logf(float arg1);

	@Generated
	@CFunction
	public static native double log(double arg1);

	@Generated
	@CFunction
	public static native float log10f(float arg1);

	@Generated
	@CFunction
	public static native double log10(double arg1);

	@Generated
	@CFunction
	public static native float log2f(float arg1);

	@Generated
	@CFunction
	public static native double log2(double arg1);

	@Generated
	@CFunction
	public static native float log1pf(float arg1);

	@Generated
	@CFunction
	public static native double log1p(double arg1);

	@Generated
	@CFunction
	public static native float logbf(float arg1);

	@Generated
	@CFunction
	public static native double logb(double arg1);

	@Generated
	@CFunction
	public static native float modff(float arg1, FloatPtr arg2);

	@Generated
	@CFunction
	public static native double modf(double arg1, DoublePtr arg2);

	@Generated
	@CFunction
	public static native float ldexpf(float arg1, int arg2);

	@Generated
	@CFunction
	public static native double ldexp(double arg1, int arg2);

	@Generated
	@CFunction
	public static native float frexpf(float arg1, IntPtr arg2);

	@Generated
	@CFunction
	public static native double frexp(double arg1, IntPtr arg2);

	@Generated
	@CFunction
	public static native int ilogbf(float arg1);

	@Generated
	@CFunction
	public static native int ilogb(double arg1);

	@Generated
	@CFunction
	public static native float scalbnf(float arg1, int arg2);

	@Generated
	@CFunction
	public static native double scalbn(double arg1, int arg2);

	@Generated
	@CFunction
	public static native float scalblnf(float arg1, long arg2);

	@Generated
	@CFunction
	public static native double scalbln(double arg1, long arg2);

	@Generated
	@CFunction
	public static native float fabsf(float arg1);

	@Generated
	@CFunction
	public static native double fabs(double arg1);

	@Generated
	@CFunction
	public static native float cbrtf(float arg1);

	@Generated
	@CFunction
	public static native double cbrt(double arg1);

	@Generated
	@CFunction
	public static native float hypotf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double hypot(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float powf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double pow(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float sqrtf(float arg1);

	@Generated
	@CFunction
	public static native double sqrt(double arg1);

	@Generated
	@CFunction
	public static native float erff(float arg1);

	@Generated
	@CFunction
	public static native double erf(double arg1);

	@Generated
	@CFunction
	public static native float erfcf(float arg1);

	@Generated
	@CFunction
	public static native double erfc(double arg1);

	@Generated
	@CFunction
	public static native float lgammaf(float arg1);

	@Generated
	@CFunction
	public static native double lgamma(double arg1);

	@Generated
	@CFunction
	public static native float tgammaf(float arg1);

	@Generated
	@CFunction
	public static native double tgamma(double arg1);

	@Generated
	@CFunction
	public static native float ceilf(float arg1);

	@Generated
	@CFunction
	public static native double ceil(double arg1);

	@Generated
	@CFunction
	public static native float floorf(float arg1);

	@Generated
	@CFunction
	public static native double floor(double arg1);

	@Generated
	@CFunction
	public static native float nearbyintf(float arg1);

	@Generated
	@CFunction
	public static native double nearbyint(double arg1);

	@Generated
	@CFunction
	public static native float rintf(float arg1);

	@Generated
	@CFunction
	public static native double rint(double arg1);

	@Generated
	@CFunction
	public static native long lrintf(float arg1);

	@Generated
	@CFunction
	public static native long lrint(double arg1);

	@Generated
	@CFunction
	public static native float roundf(float arg1);

	@Generated
	@CFunction
	public static native double round(double arg1);

	@Generated
	@CFunction
	public static native long lroundf(float arg1);

	@Generated
	@CFunction
	public static native long lround(double arg1);

	@Generated
	@CFunction
	public static native long llrintf(float arg1);

	@Generated
	@CFunction
	public static native long llrint(double arg1);

	@Generated
	@CFunction
	public static native long llroundf(float arg1);

	@Generated
	@CFunction
	public static native long llround(double arg1);

	@Generated
	@CFunction
	public static native float truncf(float arg1);

	@Generated
	@CFunction
	public static native double trunc(double arg1);

	@Generated
	@CFunction
	public static native float fmodf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double fmod(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float remainderf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double remainder(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float remquof(float arg1, float arg2, IntPtr arg3);

	@Generated
	@CFunction
	public static native double remquo(double arg1, double arg2, IntPtr arg3);

	@Generated
	@CFunction
	public static native float copysignf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double copysign(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float nanf(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native double nan(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native float nextafterf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double nextafter(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float fdimf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double fdim(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float fmaxf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double fmax(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float fminf(float arg1, float arg2);

	@Generated
	@CFunction
	public static native double fmin(double arg1, double arg2);

	@Generated
	@CFunction
	public static native float fmaf(float arg1, float arg2, float arg3);

	@Generated
	@CFunction
	public static native double fma(double arg1, double arg2, double arg3);

	@Generated
	@CFunction
	@ByValue
	public static native __float2 __sincosf_stret(float arg1);

	@Generated
	@CFunction
	@ByValue
	public static native __double2 __sincos_stret(double arg1);

	@Generated
	@CFunction
	@ByValue
	public static native __float2 __sincospif_stret(float arg1);

	@Generated
	@CFunction
	@ByValue
	public static native __double2 __sincospi_stret(double arg1);

	@Generated
	@CFunction
	public static native double j0(double arg1);

	@Generated
	@CFunction
	public static native double j1(double arg1);

	@Generated
	@CFunction
	public static native double jn(int arg1, double arg2);

	@Generated
	@CFunction
	public static native double y0(double arg1);

	@Generated
	@CFunction
	public static native double y1(double arg1);

	@Generated
	@CFunction
	public static native double yn(int arg1, double arg2);

	@Generated
	@CFunction
	public static native double scalb(double arg1, double arg2);

	@Generated
	@CFunction
	public static native void longjmperror();

	@Generated
	@CFunction
	public static native int raise(int arg1);

	@Generated
	@CFunction
	public static native int kill(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int killpg(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int pthread_kill(
			@UncertainArgument("Options: reference, array Fallback: reference") _opaque_pthread_t arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int pthread_sigmask(int arg1, ConstIntPtr arg2,
			IntPtr arg3);

	@Generated
	@CFunction
	public static native int sigaction(int arg1, VoidPtr arg2, VoidPtr arg3);

	@Generated
	@CFunction
	public static native int sigaddset(IntPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int sigaltstack(
			@UncertainArgument("Options: reference, array Fallback: reference") stack_t arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stack_t arg2);

	@Generated
	@CFunction
	public static native int sigdelset(IntPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int sigemptyset(IntPtr arg1);

	@Generated
	@CFunction
	public static native int sigfillset(IntPtr arg1);

	@Generated
	@CFunction
	public static native int sighold(int arg1);

	@Generated
	@CFunction
	public static native int sigignore(int arg1);

	@Generated
	@CFunction
	public static native int siginterrupt(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int sigismember(ConstIntPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int sigpause(int arg1);

	@Generated
	@CFunction
	public static native int sigpending(IntPtr arg1);

	@Generated
	@CFunction
	public static native int sigprocmask(int arg1, ConstIntPtr arg2, IntPtr arg3);

	@Generated
	@CFunction
	public static native int sigrelse(int arg1);

	@Generated
	@CFunction
	public static native int sigsuspend(ConstIntPtr arg1);

	@Generated
	@CFunction
	public static native int sigwait(ConstIntPtr arg1, IntPtr arg2);

	@Generated
	@CFunction
	public static native void psignal(
			int arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int sigblock(int arg1);

	@Generated
	@CFunction
	public static native int sigsetmask(int arg1);

	@Generated
	@CFunction
	public static native int sigvec(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") sigvec arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") sigvec arg3);

	@Generated
	@Inline
	@CFunction
	public static native int __sigbits(int __signo);

	@Generated
	@CFunction
	public static native void clearerr(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int fclose(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int feof(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int ferror(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int fflush(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int fgetc(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int fgetpos(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			LongPtr arg2);

	@Generated
	@CFunction
	public static native BytePtr fgets(
			BytePtr arg1,
			int arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE fopen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int fputc(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@CFunction
	public static native int fputs(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@CFunction
	public static native long fread(
			VoidPtr arg1,
			long arg2,
			long arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE freopen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

	@Generated
	@CFunction
	public static native int fseek(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			long arg2, int arg3);

	@Generated
	@CFunction
	public static native int fsetpos(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			ConstLongPtr arg2);

	@Generated
	@CFunction
	public static native long ftell(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native long fwrite(
			ConstVoidPtr arg1,
			long arg2,
			long arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

	@Generated
	@CFunction
	public static native int getc(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int getchar();

	@Generated
	@CFunction
	public static native BytePtr gets(BytePtr arg1);

	@Generated
	@CFunction
	public static native void perror(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int putc(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@CFunction
	public static native int putchar(int arg1);

	@Generated
	@CFunction
	public static native int puts(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int remove(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int rename(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native void rewind(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native void setbuf(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			BytePtr arg2);

	@Generated
	@CFunction
	public static native int setvbuf(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			BytePtr arg2, int arg3, long arg4);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE tmpfile();

	@Generated
	@Deprecated
	@CFunction
	public static native BytePtr tmpnam(BytePtr arg1);

	@Generated
	@CFunction
	public static native int ungetc(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@CFunction
	public static native BytePtr ctermid(BytePtr arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE fdopen(
			int arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int fileno(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int pclose(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE popen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int __srget(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int __swbuf(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@Inline
	@CFunction
	public static native int __sputc(
			int _c,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE _p);

	@Generated
	@CFunction
	public static native void flockfile(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int ftrylockfile(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native void funlockfile(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int getc_unlocked(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int getchar_unlocked();

	@Generated
	@CFunction
	public static native int putc_unlocked(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@CFunction
	public static native int putchar_unlocked(int arg1);

	@Generated
	@CFunction
	public static native int getw(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native int putw(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg2);

	@Generated
	@Deprecated
	@CFunction
	public static native BytePtr tempnam(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int fseeko(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			long arg2, int arg3);

	@Generated
	@CFunction
	public static native long ftello(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native long getdelim(
			Ptr<BytePtr> arg1,
			LongPtr arg2,
			int arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg4);

	@Generated
	@CFunction
	public static native long getline(
			Ptr<BytePtr> arg1,
			LongPtr arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg3);

	@Generated
	@CFunction
	public static native BytePtr ctermid_r(BytePtr arg1);

	@Generated
	@CFunction
	public static native BytePtr fgetln(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			LongPtr arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String fmtcheck(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int fpurge(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	public static native void setbuffer(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1,
			BytePtr arg2, int arg3);

	@Generated
	@CFunction
	public static native int setlinebuf(
			@UncertainArgument("Options: reference, array Fallback: reference") FILE arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE zopen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			int arg3);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE funopen(ConstVoidPtr arg1,
			@FunctionPtr(name = "call_funopen_1") Function_funopen_1 arg2,
			@FunctionPtr(name = "call_funopen_2") Function_funopen_2 arg3,
			@FunctionPtr(name = "call_funopen_3") Function_funopen_3 arg4,
			@FunctionPtr(name = "call_funopen_4") Function_funopen_4 arg5);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_funopen_1 {
		@Generated
		public int call_funopen_1(VoidPtr arg0, BytePtr arg1, int arg2);
	}

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_funopen_2 {
		@Generated
		public int call_funopen_2(
				VoidPtr arg0,
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
				int arg2);
	}

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_funopen_3 {
		@Generated
		public long call_funopen_3(VoidPtr arg0, long arg1, int arg2);
	}

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_funopen_4 {
		@Generated
		public int call_funopen_4(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native VoidPtr alloca(long arg1);

	@Generated
	@CFunction
	public static native void abort();

	@Generated
	@CFunction
	public static native int abs(int arg1);

	@Generated
	@CFunction
	public static native int atexit(
			@FunctionPtr(name = "call_atexit") Function_atexit arg1);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_atexit {
		@Generated
		public void call_atexit();
	}

	@Generated
	@CFunction
	public static native double atof(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int atoi(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native long atol(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native long atoll(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native VoidPtr bsearch(ConstVoidPtr arg1, ConstVoidPtr arg2,
			long arg3, long arg4,
			@FunctionPtr(name = "call_bsearch") Function_bsearch arg5);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_bsearch {
		@Generated
		public int call_bsearch(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native VoidPtr calloc(long arg1, long arg2);

	@Generated
	@CFunction
	@ByValue
	public static native div_t div(int arg1, int arg2);

	@Generated
	@CFunction
	public static native void exit(int arg1);

	@Generated
	@CFunction
	public static native void free(VoidPtr arg1);

	@Generated
	@CFunction
	public static native BytePtr getenv(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native long labs(long arg1);

	@Generated
	@CFunction
	@ByValue
	public static native ldiv_t ldiv(long arg1, long arg2);

	@Generated
	@CFunction
	public static native long llabs(long arg1);

	@Generated
	@CFunction
	@ByValue
	public static native lldiv_t lldiv(long arg1, long arg2);

	@Generated
	@CFunction
	public static native VoidPtr malloc(long arg1);

	@Generated
	@CFunction
	public static native int mblen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			long arg2);

	@Generated
	@CFunction
	public static native long mbstowcs(
			IntPtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native int mbtowc(
			IntPtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native int posix_memalign(Ptr<VoidPtr> arg1, long arg2,
			long arg3);

	@Generated
	@CFunction
	public static native void qsort(VoidPtr arg1, long arg2, long arg3,
			@FunctionPtr(name = "call_qsort") Function_qsort arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_qsort {
		@Generated
		public int call_qsort(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native int rand();

	@Generated
	@CFunction
	public static native VoidPtr realloc(VoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native void srand(int arg1);

	@Generated
	@CFunction
	public static native double strtod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native float strtof(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native long strtol(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native long strtoll(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native long strtoul(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native long strtoull(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native int system(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native long wcstombs(BytePtr arg1, ConstIntPtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int wctomb(BytePtr arg1, int arg2);

	@Generated
	@CFunction
	public static native void _Exit(int arg1);

	@Generated
	@CFunction
	public static native long a64l(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native double drand48();

	@Generated
	@CFunction
	public static native BytePtr ecvt(double arg1, int arg2, IntPtr arg3,
			IntPtr arg4);

	@Generated
	@CFunction
	public static native BytePtr fcvt(double arg1, int arg2, IntPtr arg3,
			IntPtr arg4);

	@Generated
	@CFunction
	public static native BytePtr gcvt(double arg1, int arg2, BytePtr arg3);

	@Generated
	@CFunction
	public static native int getsubopt(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2,
			Ptr<BytePtr> arg3);

	@Generated
	@CFunction
	public static native int grantpt(int arg1);

	@Generated
	@CFunction
	public static native BytePtr initstate(int arg1, BytePtr arg2, long arg3);

	@Generated
	@CFunction
	public static native BytePtr l64a(long arg1);

	@Generated
	@CFunction
	public static native long lrand48();

	@Generated
	@CFunction
	public static native BytePtr mktemp(BytePtr arg1);

	@Generated
	@CFunction
	public static native int mkstemp(BytePtr arg1);

	@Generated
	@CFunction
	public static native long mrand48();

	@Generated
	@CFunction
	public static native int posix_openpt(int arg1);

	@Generated
	@CFunction
	public static native BytePtr ptsname(int arg1);

	@Generated
	@CFunction
	public static native int putenv(BytePtr arg1);

	@Generated
	@CFunction
	public static native long random();

	@Generated
	@CFunction
	public static native int rand_r(IntPtr arg1);

	@Generated
	@CFunction
	public static native BytePtr realpath(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			BytePtr arg2);

	@Generated
	@CFunction
	public static native int setenv(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			int arg3);

	@Generated
	@CFunction
	public static native void setkey(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native BytePtr setstate(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native void srand48(long arg1);

	@Generated
	@CFunction
	public static native void srandom(int arg1);

	@Generated
	@CFunction
	public static native int unlockpt(int arg1);

	@Generated
	@CFunction
	public static native int unsetenv(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int arc4random();

	@Generated
	@CFunction
	public static native void arc4random_addrandom(BytePtr arg1, int arg2);

	@Generated
	@CFunction
	public static native void arc4random_buf(VoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native void arc4random_stir();

	@Generated
	@CFunction
	public static native int arc4random_uniform(int arg1);

	@Generated
	@CFunction
	public static native int atexit_b(
			@ObjCBlock(name = "call_atexit_b") Block_atexit_b arg1);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_atexit_b {
		@Generated
		public void call_atexit_b();
	}

	@Generated
	@CFunction
	public static native VoidPtr bsearch_b(ConstVoidPtr arg1,
			ConstVoidPtr arg2, long arg3, long arg4,
			@ObjCBlock(name = "call_bsearch_b") Block_bsearch_b arg5);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_bsearch_b {
		@Generated
		public int call_bsearch_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native BytePtr cgetcap(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			int arg3);

	@Generated
	@CFunction
	public static native int cgetclose();

	@Generated
	@CFunction
	public static native int cgetent(
			Ptr<BytePtr> arg1,
			Ptr<BytePtr> arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

	@Generated
	@CFunction
	public static native int cgetfirst(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native int cgetmatch(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int cgetnext(Ptr<BytePtr> arg1, Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native int cgetnum(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			LongPtr arg3);

	@Generated
	@CFunction
	public static native int cgetset(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int cgetstr(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			Ptr<BytePtr> arg3);

	@Generated
	@CFunction
	public static native int cgetustr(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			Ptr<BytePtr> arg3);

	@Generated
	@Deprecated
	@CFunction
	public static native int daemon(int arg1, int arg2);

	@Generated
	@CFunction
	public static native BytePtr devname(int arg1, short arg2);

	@Generated
	@CFunction
	public static native BytePtr devname_r(int arg1, short arg2, BytePtr buf,
			int len);

	@Generated
	@CFunction
	public static native BytePtr getbsize(IntPtr arg1, LongPtr arg2);

	@Generated
	@CFunction
	public static native int getloadavg(DoublePtr arg1, int arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String getprogname();

	@Generated
	@CFunction
	public static native int heapsort(VoidPtr arg1, long arg2, long arg3,
			@FunctionPtr(name = "call_heapsort") Function_heapsort arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_heapsort {
		@Generated
		public int call_heapsort(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native int heapsort_b(VoidPtr arg1, long arg2, long arg3,
			@ObjCBlock(name = "call_heapsort_b") Block_heapsort_b arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_heapsort_b {
		@Generated
		public int call_heapsort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native int mergesort(VoidPtr arg1, long arg2, long arg3,
			@FunctionPtr(name = "call_mergesort") Function_mergesort arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_mergesort {
		@Generated
		public int call_mergesort(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native int mergesort_b(VoidPtr arg1, long arg2, long arg3,
			@ObjCBlock(name = "call_mergesort_b") Block_mergesort_b arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_mergesort_b {
		@Generated
		public int call_mergesort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void psort(VoidPtr arg1, long arg2, long arg3,
			@FunctionPtr(name = "call_psort") Function_psort arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_psort {
		@Generated
		public int call_psort(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void psort_b(VoidPtr arg1, long arg2, long arg3,
			@ObjCBlock(name = "call_psort_b") Block_psort_b arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_psort_b {
		@Generated
		public int call_psort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void psort_r(VoidPtr arg1, long arg2, long arg3,
			VoidPtr arg4,
			@FunctionPtr(name = "call_psort_r") Function_psort_r arg5);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_psort_r {
		@Generated
		public int call_psort_r(VoidPtr arg0, ConstVoidPtr arg1,
				ConstVoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native void qsort_b(VoidPtr arg1, long arg2, long arg3,
			@ObjCBlock(name = "call_qsort_b") Block_qsort_b arg4);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_qsort_b {
		@Generated
		public int call_qsort_b(ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native void qsort_r(VoidPtr arg1, long arg2, long arg3,
			VoidPtr arg4,
			@FunctionPtr(name = "call_qsort_r") Function_qsort_r arg5);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_qsort_r {
		@Generated
		public int call_qsort_r(VoidPtr arg0, ConstVoidPtr arg1,
				ConstVoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native int radixsort(
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			int arg4);

	@Generated
	@CFunction
	public static native void setprogname(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int sradixsort(
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			int arg4);

	@Generated
	@CFunction
	public static native void sranddev();

	@Generated
	@CFunction
	public static native void srandomdev();

	@Generated
	@CFunction
	public static native VoidPtr reallocf(VoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native long strtoq(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native long strtouq(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, int arg3);

	@Generated
	@CFunction
	public static native VoidPtr valloc(long arg1);

	@Generated
	@CFunction
	public static native VoidPtr memchr(ConstVoidPtr arg1, int arg2, long arg3);

	@Generated
	@CFunction
	public static native int memcmp(ConstVoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native VoidPtr memcpy(VoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native VoidPtr memmove(VoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native VoidPtr memset(VoidPtr arg1, int arg2, long arg3);

	@Generated
	@CFunction
	public static native BytePtr strcat(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strchr(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int strcmp(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int strcoll(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strcpy(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native long strcspn(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strerror(int arg1);

	@Generated
	@CFunction
	public static native long strlen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native BytePtr strncat(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native int strncmp(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native BytePtr strncpy(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native BytePtr strpbrk(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strrchr(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native long strspn(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strstr(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strtok(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native long strxfrm(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native BytePtr strtok_r(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			Ptr<BytePtr> arg3);

	@Generated
	@CFunction
	public static native int strerror_r(int arg1, BytePtr arg2, long arg3);

	@Generated
	@CFunction
	public static native BytePtr strdup(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native VoidPtr memccpy(VoidPtr arg1, ConstVoidPtr arg2,
			int arg3, long arg4);

	@Generated
	@CFunction
	public static native BytePtr stpcpy(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr stpncpy(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native BytePtr strndup(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			long arg2);

	@Generated
	@CFunction
	public static native long strnlen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			long arg2);

	@Generated
	@CFunction
	public static native BytePtr strsignal(int sig);

	@Generated
	@CFunction
	public static native VoidPtr memmem(ConstVoidPtr arg1, long arg2,
			ConstVoidPtr arg3, long arg4);

	@Generated
	@CFunction
	public static native void memset_pattern4(VoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native void memset_pattern8(VoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native void memset_pattern16(VoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native BytePtr strcasestr(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native BytePtr strnstr(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native long strlcat(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native long strlcpy(
			BytePtr arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native void strmode(int arg1, BytePtr arg2);

	@Generated
	@CFunction
	public static native BytePtr strsep(
			Ptr<BytePtr> arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native void swab(ConstVoidPtr arg1, VoidPtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int bcmp(ConstVoidPtr arg1, ConstVoidPtr arg2,
			long arg3);

	@Generated
	@CFunction
	public static native void bcopy(ConstVoidPtr arg1, VoidPtr arg2, long arg3);

	@Generated
	@CFunction
	public static native void bzero(VoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native BytePtr index(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native BytePtr rindex(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int ffs(int arg1);

	@Generated
	@CFunction
	public static native int strcasecmp(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int strncasecmp(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			long arg3);

	@Generated
	@CFunction
	public static native int ffsl(long arg1);

	@Generated
	@CFunction
	public static native int ffsll(long arg1);

	@Generated
	@CFunction
	public static native int fls(int arg1);

	@Generated
	@CFunction
	public static native int flsl(long arg1);

	@Generated
	@CFunction
	public static native int flsll(long arg1);

	@Generated
	@CFunction
	public static native BytePtr asctime(
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

	@Generated
	@CFunction
	public static native long clock();

	@Generated
	@CFunction
	public static native BytePtr ctime(ConstLongPtr arg1);

	@Generated
	@CFunction
	public static native double difftime(long arg1, long arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native tm getdate(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native tm gmtime(ConstLongPtr arg1);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native tm localtime(ConstLongPtr arg1);

	@Generated
	@CFunction
	public static native long mktime(
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

	@Generated
	@CFunction
	public static native long strftime(
			BytePtr arg1,
			long arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg4);

	@Generated
	@CFunction
	public static native BytePtr strptime(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg3);

	@Generated
	@CFunction
	public static native long time(LongPtr arg1);

	@Generated
	@CFunction
	public static native void tzset();

	@Generated
	@CFunction
	public static native BytePtr asctime_r(
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg1,
			BytePtr arg2);

	@Generated
	@CFunction
	public static native BytePtr ctime_r(ConstLongPtr arg1, BytePtr arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native tm gmtime_r(
			ConstLongPtr arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native tm localtime_r(
			ConstLongPtr arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg2);

	@Generated
	@CFunction
	public static native long posix2time(long arg1);

	@Generated
	@CFunction
	public static native void tzsetwall();

	@Generated
	@CFunction
	public static native long time2posix(long arg1);

	@Generated
	@CFunction
	public static native long timelocal(
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

	@Generated
	@CFunction
	public static native long timegm(
			@UncertainArgument("Options: reference, array Fallback: reference") tm arg1);

	@Generated
	@CFunction
	public static native int nanosleep(
			@UncertainArgument("Options: reference, array Fallback: reference") timespec arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") timespec arg2);

	@Generated
	@CFunction
	public static native long imaxabs(long j);

	@Generated
	@CFunction
	@ByValue
	public static native imaxdiv_t imaxdiv(long __numer, long __denom);

	@Generated
	@CFunction
	public static native long strtoimax(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
			Ptr<BytePtr> __endptr, int __base);

	@Generated
	@CFunction
	public static native long strtoumax(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String __nptr,
			Ptr<BytePtr> __endptr, int __base);

	@Generated
	@CFunction
	public static native long wcstoimax(ConstIntPtr __nptr,
			Ptr<IntPtr> __endptr, int __base);

	@Generated
	@CFunction
	public static native long wcstoumax(ConstIntPtr __nptr,
			Ptr<IntPtr> __endptr, int __base);

	@Generated
	@CFunction
	public static native VoidPtr _Block_copy(ConstVoidPtr aBlock);

	@Generated
	@CFunction
	public static native void _Block_release(ConstVoidPtr aBlock);

	@Generated
	@CFunction
	public static native void _Block_object_assign(VoidPtr arg1,
			ConstVoidPtr arg2, int arg3);

	@Generated
	@CFunction
	public static native void _Block_object_dispose(ConstVoidPtr arg1, int arg2);

	@Generated
	@Inline
	@CFunction
	public static native short OSReadSwapInt16(ConstVoidPtr base,
			long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native int OSReadSwapInt32(ConstVoidPtr base, long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native long OSReadSwapInt64(ConstVoidPtr base, long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native void OSWriteSwapInt16(VoidPtr base, long byteOffset,
			short data);

	@Generated
	@Inline
	@CFunction
	public static native void OSWriteSwapInt32(VoidPtr base, long byteOffset,
			int data);

	@Generated
	@Inline
	@CFunction
	public static native void OSWriteSwapInt64(VoidPtr base, long byteOffset,
			long data);

	@Generated
	@Inline
	@CFunction
	public static native int OSHostByteOrder();

	@Generated
	@Inline
	@CFunction
	public static native short _OSReadInt16(ConstVoidPtr base, long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native int _OSReadInt32(ConstVoidPtr base, long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native long _OSReadInt64(ConstVoidPtr base, long byteOffset);

	@Generated
	@Inline
	@CFunction
	public static native void _OSWriteInt16(VoidPtr base, long byteOffset,
			short data);

	@Generated
	@Inline
	@CFunction
	public static native void _OSWriteInt32(VoidPtr base, long byteOffset,
			int data);

	@Generated
	@Inline
	@CFunction
	public static native void _OSWriteInt64(VoidPtr base, long byteOffset,
			long data);

	@Generated
	@CFunction
	public static native void _exit(int arg1);

	@Generated
	@CFunction
	public static native int access(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int alarm(int arg1);

	@Generated
	@CFunction
	public static native int chdir(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int chown(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2, int arg3);

	@Generated
	@CFunction
	public static native int close(int arg1);

	@Generated
	@CFunction
	public static native int dup(int arg1);

	@Generated
	@CFunction
	public static native int dup2(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int execv(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native int execve(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2, Ptr<BytePtr> arg3);

	@Generated
	@CFunction
	public static native int execvp(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			Ptr<BytePtr> arg2);

	@Generated
	@CFunction
	public static native int fork();

	@Generated
	@CFunction
	public static native long fpathconf(int arg1, int arg2);

	@Generated
	@CFunction
	public static native BytePtr getcwd(BytePtr arg1, long arg2);

	@Generated
	@CFunction
	public static native int getegid();

	@Generated
	@CFunction
	public static native int geteuid();

	@Generated
	@CFunction
	public static native int getgid();

	@Generated
	@CFunction
	public static native int getgroups(int arg1, IntPtr arg2);

	@Generated
	@CFunction
	public static native BytePtr getlogin();

	@Generated
	@CFunction
	public static native int getpgrp();

	@Generated
	@CFunction
	public static native int getpid();

	@Generated
	@CFunction
	public static native int getppid();

	@Generated
	@CFunction
	public static native int getuid();

	@Generated
	@CFunction
	public static native int isatty(int arg1);

	@Generated
	@CFunction
	public static native int link(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native long lseek(int arg1, long arg2, int arg3);

	@Generated
	@CFunction
	public static native long pathconf(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int pause();

	@Generated
	@CFunction
	public static native long read(int arg1, VoidPtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int rmdir(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int setgid(int arg1);

	@Generated
	@CFunction
	public static native int setpgid(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int setsid();

	@Generated
	@CFunction
	public static native int setuid(int arg1);

	@Generated
	@CFunction
	public static native int sleep(int arg1);

	@Generated
	@CFunction
	public static native long sysconf(int arg1);

	@Generated
	@CFunction
	public static native int tcgetpgrp(int arg1);

	@Generated
	@CFunction
	public static native int tcsetpgrp(int arg1, int arg2);

	@Generated
	@CFunction
	public static native BytePtr ttyname(int arg1);

	@Generated
	@CFunction
	public static native int ttyname_r(int arg1, BytePtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int unlink(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native long write(int arg1, ConstVoidPtr arg2, long arg3);

	@Generated
	@CFunction
	public static native long confstr(int arg1, BytePtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int getopt(
			int arg1,
			Ptr<BytePtr> arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3);

	@Generated
	@Deprecated
	@CFunction
	public static native VoidPtr brk(ConstVoidPtr arg1);

	@Generated
	@CFunction
	public static native int chroot(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native BytePtr crypt(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native void encrypt(BytePtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int fchdir(int arg1);

	@Generated
	@CFunction
	public static native long gethostid();

	@Generated
	@CFunction
	public static native int getpgid(int arg1);

	@Generated
	@CFunction
	public static native int getsid(int arg1);

	@Generated
	@CFunction
	public static native int getdtablesize();

	@Generated
	@CFunction
	public static native int getpagesize();

	@Generated
	@CFunction
	public static native BytePtr getpass(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native BytePtr getwd(BytePtr arg1);

	@Generated
	@CFunction
	public static native int lchown(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2, int arg3);

	@Generated
	@CFunction
	public static native int lockf(int arg1, int arg2, long arg3);

	@Generated
	@CFunction
	public static native int nice(int arg1);

	@Generated
	@CFunction
	public static native long pread(int arg1, VoidPtr arg2, long arg3, long arg4);

	@Generated
	@CFunction
	public static native long pwrite(int arg1, ConstVoidPtr arg2, long arg3,
			long arg4);

	@Generated
	@Deprecated
	@CFunction
	public static native VoidPtr sbrk(int arg1);

	@Generated
	@CFunction
	public static native int setpgrp();

	@Generated
	@CFunction
	public static native int setregid(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int setreuid(int arg1, int arg2);

	@Generated
	@CFunction
	public static native void sync();

	@Generated
	@CFunction
	public static native int truncate(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			long arg2);

	@Generated
	@CFunction
	public static native int ualarm(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int usleep(int arg1);

	@Generated
	@CFunction
	public static native int vfork();

	@Generated
	@CFunction
	public static native int fsync(int arg1);

	@Generated
	@CFunction
	public static native int ftruncate(int arg1, long arg2);

	@Generated
	@CFunction
	public static native int getlogin_r(BytePtr arg1, long arg2);

	@Generated
	@CFunction
	public static native int fchown(int arg1, int arg2, int arg3);

	@Generated
	@CFunction
	public static native int gethostname(BytePtr arg1, long arg2);

	@Generated
	@CFunction
	public static native long readlink(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			BytePtr arg2, long arg3);

	@Generated
	@CFunction
	public static native int setegid(int arg1);

	@Generated
	@CFunction
	public static native int seteuid(int arg1);

	@Generated
	@CFunction
	public static native int symlink(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2);

	@Generated
	@CFunction
	public static native int accessx_np(
			@UncertainArgument("Options: reference, array Fallback: reference") accessx_descriptor arg1,
			long arg2, IntPtr arg3, int arg4);

	@Generated
	@CFunction
	public static native int acct(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int add_profil(BytePtr arg1, long arg2, long arg3,
			int arg4);

	@Generated
	@CFunction
	public static native void endusershell();

	@Generated
	@CFunction
	public static native int execvP(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			Ptr<BytePtr> arg3);

	@Generated
	@CFunction
	public static native BytePtr fflagstostr(long arg1);

	@Generated
	@CFunction
	public static native int getdomainname(BytePtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int getgrouplist(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2, IntPtr arg3, IntPtr arg4);

	@Generated
	@CFunction
	public static native short getmode(ConstVoidPtr arg1, short arg2);

	@Generated
	@CFunction
	public static native int getpeereid(int arg1, IntPtr arg2, IntPtr arg3);

	@Generated
	@CFunction
	public static native BytePtr getusershell();

	@Generated
	@CFunction
	public static native int initgroups(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int iruserok(
			long arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

	@Generated
	@CFunction
	public static native int iruserok_sa(
			ConstVoidPtr arg1,
			int arg2,
			int arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5);

	@Generated
	@CFunction
	public static native int issetugid();

	@Generated
	@CFunction
	public static native BytePtr mkdtemp(BytePtr arg1);

	@Generated
	@CFunction
	public static native int mknod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2, int arg3);

	@Generated
	@CFunction
	public static native int mkpath_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			short omode);

	@Generated
	@CFunction
	public static native int mkstemps(BytePtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int nfssvc(int arg1, VoidPtr arg2);

	@Generated
	@CFunction
	public static native int profil(BytePtr arg1, long arg2, long arg3, int arg4);

	@Generated
	@CFunction
	public static native int pthread_setugid_np(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int pthread_getugid_np(IntPtr arg1, IntPtr arg2);

	@Generated
	@CFunction
	public static native int rcmd(
			Ptr<BytePtr> arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
			IntPtr arg6);

	@Generated
	@CFunction
	public static native int rcmd_af(
			Ptr<BytePtr> arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg5,
			IntPtr arg6, int arg7);

	@Generated
	@CFunction
	public static native int reboot(int arg1);

	@Generated
	@CFunction
	public static native int revoke(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int rresvport(IntPtr arg1);

	@Generated
	@CFunction
	public static native int rresvport_af(IntPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int ruserok(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg3,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg4);

	@Generated
	@CFunction
	public static native int setdomainname(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int setgroups(int arg1, ConstIntPtr arg2);

	@Generated
	@CFunction
	public static native void sethostid(long arg1);

	@Generated
	@CFunction
	public static native int sethostname(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int setlogin(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native VoidPtr setmode(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int setrgid(int arg1);

	@Generated
	@CFunction
	public static native int setruid(int arg1);

	@Generated
	@CFunction
	public static native void setusershell();

	@Generated
	@CFunction
	public static native int strtofflags(Ptr<BytePtr> arg1, LongPtr arg2,
			LongPtr arg3);

	@Generated
	@CFunction
	public static native int swapon(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int ttyslot();

	@Generated
	@CFunction
	public static native int undelete(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int unwhiteout(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int fgetattrlist(int arg1, VoidPtr arg2, VoidPtr arg3,
			long arg4, int arg5);

	@Generated
	@CFunction
	public static native int fsetattrlist(int arg1, VoidPtr arg2, VoidPtr arg3,
			long arg4, int arg5);

	@Generated
	@CFunction
	public static native int getattrlist(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			VoidPtr arg2, VoidPtr arg3, long arg4, int arg5);

	@Generated
	@CFunction
	public static native int setattrlist(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			VoidPtr arg2, VoidPtr arg3, long arg4, int arg5);

	@Generated
	@CFunction
	public static native int exchangedata(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg2,
			int arg3);

	@Generated
	@CFunction
	public static native int getdirentriesattr(int arg1, VoidPtr arg2,
			VoidPtr arg3, long arg4, IntPtr arg5, IntPtr arg6, IntPtr arg7,
			int arg8);

	@Generated
	@CFunction
	public static native int searchfs(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			VoidPtr arg2, LongPtr arg3, int arg4, int arg5, VoidPtr arg6);

	@Generated
	@CFunction
	public static native int fsctl(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			long arg2, VoidPtr arg3, int arg4);

	@Generated
	@CFunction
	public static native int ffsctl(int arg1, long arg2, VoidPtr arg3, int arg4);

	@Generated
	@CFunction
	public static native int fsync_volume_np(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int sync_volume_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String sel_getName(SEL sel);

	@Generated
	@CFunction
	public static native SEL sel_registerName(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String object_getClassName(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@CFunction
	public static native VoidPtr object_getIndexedIvars(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@CFunction
	public static native boolean sel_isMapped(SEL sel);

	@Generated
	@CFunction
	public static native SEL sel_getUid(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String str);

	@Generated
	@Inline
	@CFunction
	public static native void _dispatch_object_validate(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native void dispatch_retain(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native void dispatch_release(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native VoidPtr dispatch_get_context(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native void dispatch_set_context(
			@Mapped(ObjCObjectMapper.class) Object object, VoidPtr context);

	@Generated
	@CFunction
	public static native void dispatch_set_finalizer_f(
			@Mapped(ObjCObjectMapper.class) Object object,
			@FunctionPtr(name = "call_dispatch_set_finalizer_f") Function_dispatch_set_finalizer_f finalizer);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_set_finalizer_f {
		@Generated
		public void call_dispatch_set_finalizer_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_suspend(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native void dispatch_resume(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native long dispatch_time(long when, long delta);

	@Generated
	@CFunction
	public static native long dispatch_walltime(
			@UncertainArgument("Options: reference, array Fallback: reference") timespec when,
			long delta);

	@Generated
	@CFunction
	public static native void dispatch_async(
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_async") Block_dispatch_async block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_async {
		@Generated
		public void call_dispatch_async();
	}

	@Generated
	@CFunction
	public static native void dispatch_async_f(
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_async_f") Function_dispatch_async_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_async_f {
		@Generated
		public void call_dispatch_async_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_sync(
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_sync") Block_dispatch_sync block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_sync {
		@Generated
		public void call_dispatch_sync();
	}

	@Generated
	@CFunction
	public static native void dispatch_sync_f(
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_sync_f") Function_dispatch_sync_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_sync_f {
		@Generated
		public void call_dispatch_sync_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_apply(long iterations,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_apply") Block_dispatch_apply block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_apply {
		@Generated
		public void call_dispatch_apply(long arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_apply_f(
			long iterations,
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_apply_f") Function_dispatch_apply_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_apply_f {
		@Generated
		public void call_dispatch_apply_f(VoidPtr arg0, long arg1);
	}

	@Generated
	@Deprecated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_get_current_queue();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_get_global_queue(long priority,
			long flags);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_queue_create(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
			@Mapped(ObjCObjectMapper.class) Object attr);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String dispatch_queue_get_label(
			@Mapped(ObjCObjectMapper.class) Object queue);

	@Generated
	@CFunction
	public static native void dispatch_set_target_queue(
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object queue);

	@Generated
	@CFunction
	public static native void dispatch_main();

	@Generated
	@CFunction
	public static native void dispatch_after(long when,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_after") Block_dispatch_after block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_after {
		@Generated
		public void call_dispatch_after();
	}

	@Generated
	@CFunction
	public static native void dispatch_after_f(
			long when,
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_after_f") Function_dispatch_after_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_after_f {
		@Generated
		public void call_dispatch_after_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_barrier_async(
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_barrier_async") Block_dispatch_barrier_async block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_barrier_async {
		@Generated
		public void call_dispatch_barrier_async();
	}

	@Generated
	@CFunction
	public static native void dispatch_barrier_async_f(
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_barrier_async_f") Function_dispatch_barrier_async_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_barrier_async_f {
		@Generated
		public void call_dispatch_barrier_async_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_barrier_sync(
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_barrier_sync") Block_dispatch_barrier_sync block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_barrier_sync {
		@Generated
		public void call_dispatch_barrier_sync();
	}

	@Generated
	@CFunction
	public static native void dispatch_barrier_sync_f(
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_barrier_sync_f") Function_dispatch_barrier_sync_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_barrier_sync_f {
		@Generated
		public void call_dispatch_barrier_sync_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_queue_set_specific(
			@Mapped(ObjCObjectMapper.class) Object queue,
			ConstVoidPtr key,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_queue_set_specific") Function_dispatch_queue_set_specific destructor);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_queue_set_specific {
		@Generated
		public void call_dispatch_queue_set_specific(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native VoidPtr dispatch_queue_get_specific(
			@Mapped(ObjCObjectMapper.class) Object queue, ConstVoidPtr key);

	@Generated
	@CFunction
	public static native VoidPtr dispatch_get_specific(ConstVoidPtr key);

	@Generated
	@CFunction
	public static native int mach_msg_overwrite(
			@UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg,
			int option,
			int send_size,
			int rcv_size,
			int rcv_name,
			int timeout,
			int notify_,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t rcv_msg,
			int rcv_limit);

	@Generated
	@CFunction
	public static native int mach_msg(
			@UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg,
			int option, int send_size, int rcv_size, int rcv_name, int timeout,
			int notify_);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_source_create(
			dispatch_source_type_t type, long handle, long mask,
			@Mapped(ObjCObjectMapper.class) Object queue);

	@Generated
	@CFunction
	public static native void dispatch_source_set_event_handler(
			@Mapped(ObjCObjectMapper.class) Object source,
			@ObjCBlock(name = "call_dispatch_source_set_event_handler") Block_dispatch_source_set_event_handler handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_source_set_event_handler {
		@Generated
		public void call_dispatch_source_set_event_handler();
	}

	@Generated
	@CFunction
	public static native void dispatch_source_set_event_handler_f(
			@Mapped(ObjCObjectMapper.class) Object source,
			@FunctionPtr(name = "call_dispatch_source_set_event_handler_f") Function_dispatch_source_set_event_handler_f handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_source_set_event_handler_f {
		@Generated
		public void call_dispatch_source_set_event_handler_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_source_set_cancel_handler(
			@Mapped(ObjCObjectMapper.class) Object source,
			@ObjCBlock(name = "call_dispatch_source_set_cancel_handler") Block_dispatch_source_set_cancel_handler cancel_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_source_set_cancel_handler {
		@Generated
		public void call_dispatch_source_set_cancel_handler();
	}

	@Generated
	@CFunction
	public static native void dispatch_source_set_cancel_handler_f(
			@Mapped(ObjCObjectMapper.class) Object source,
			@FunctionPtr(name = "call_dispatch_source_set_cancel_handler_f") Function_dispatch_source_set_cancel_handler_f cancel_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_source_set_cancel_handler_f {
		@Generated
		public void call_dispatch_source_set_cancel_handler_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_source_cancel(
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@CFunction
	public static native long dispatch_source_testcancel(
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@CFunction
	public static native long dispatch_source_get_handle(
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@CFunction
	public static native long dispatch_source_get_mask(
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@CFunction
	public static native long dispatch_source_get_data(
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@CFunction
	public static native void dispatch_source_merge_data(
			@Mapped(ObjCObjectMapper.class) Object source, long value);

	@Generated
	@CFunction
	public static native void dispatch_source_set_timer(
			@Mapped(ObjCObjectMapper.class) Object source, long start,
			long interval, long leeway);

	@Generated
	@CFunction
	public static native void dispatch_source_set_registration_handler(
			@Mapped(ObjCObjectMapper.class) Object source,
			@ObjCBlock(name = "call_dispatch_source_set_registration_handler") Block_dispatch_source_set_registration_handler registration_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_source_set_registration_handler {
		@Generated
		public void call_dispatch_source_set_registration_handler();
	}

	@Generated
	@CFunction
	public static native void dispatch_source_set_registration_handler_f(
			@Mapped(ObjCObjectMapper.class) Object source,
			@FunctionPtr(name = "call_dispatch_source_set_registration_handler_f") Function_dispatch_source_set_registration_handler_f registration_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_source_set_registration_handler_f {
		@Generated
		public void call_dispatch_source_set_registration_handler_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_group_create();

	@Generated
	@CFunction
	public static native void dispatch_group_async(
			@Mapped(ObjCObjectMapper.class) Object group,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_group_async") Block_dispatch_group_async block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_group_async {
		@Generated
		public void call_dispatch_group_async();
	}

	@Generated
	@CFunction
	public static native void dispatch_group_async_f(
			@Mapped(ObjCObjectMapper.class) Object group,
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_group_async_f") Function_dispatch_group_async_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_group_async_f {
		@Generated
		public void call_dispatch_group_async_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native long dispatch_group_wait(
			@Mapped(ObjCObjectMapper.class) Object group, long timeout);

	@Generated
	@CFunction
	public static native void dispatch_group_notify(
			@Mapped(ObjCObjectMapper.class) Object group,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_group_notify") Block_dispatch_group_notify block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_group_notify {
		@Generated
		public void call_dispatch_group_notify();
	}

	@Generated
	@CFunction
	public static native void dispatch_group_notify_f(
			@Mapped(ObjCObjectMapper.class) Object group,
			@Mapped(ObjCObjectMapper.class) Object queue,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_group_notify_f") Function_dispatch_group_notify_f work);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_group_notify_f {
		@Generated
		public void call_dispatch_group_notify_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_group_enter(
			@Mapped(ObjCObjectMapper.class) Object group);

	@Generated
	@CFunction
	public static native void dispatch_group_leave(
			@Mapped(ObjCObjectMapper.class) Object group);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_semaphore_create(long value);

	@Generated
	@CFunction
	public static native long dispatch_semaphore_wait(
			@Mapped(ObjCObjectMapper.class) Object dsema, long timeout);

	@Generated
	@CFunction
	public static native long dispatch_semaphore_signal(
			@Mapped(ObjCObjectMapper.class) Object dsema);

	@Generated
	@CFunction
	public static native void dispatch_once(LongPtr predicate,
			@ObjCBlock(name = "call_dispatch_once") Block_dispatch_once block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_once {
		@Generated
		public void call_dispatch_once();
	}

	@Generated
	@Inline
	@CFunction
	public static native void _dispatch_once(LongPtr predicate,
			@ObjCBlock(name = "call__dispatch_once") Block__dispatch_once block);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block__dispatch_once {
		@Generated
		public void call__dispatch_once();
	}

	@Generated
	@CFunction
	public static native void dispatch_once_f(
			LongPtr predicate,
			VoidPtr context,
			@FunctionPtr(name = "call_dispatch_once_f") Function_dispatch_once_f function);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dispatch_once_f {
		@Generated
		public void call_dispatch_once_f(VoidPtr arg0);
	}

	@Generated
	@Inline
	@CFunction
	public static native void _dispatch_once_f(
			LongPtr predicate,
			VoidPtr context,
			@FunctionPtr(name = "call__dispatch_once_f") Function__dispatch_once_f function);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function__dispatch_once_f {
		@Generated
		public void call__dispatch_once_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_data_create(
			ConstVoidPtr buffer,
			long size,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_data_create") Block_dispatch_data_create destructor);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_data_create {
		@Generated
		public void call_dispatch_data_create();
	}

	@Generated
	@CFunction
	public static native long dispatch_data_get_size(
			@Mapped(ObjCObjectMapper.class) Object data);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_data_create_map(
			@Mapped(ObjCObjectMapper.class) Object data,
			Ptr<ConstVoidPtr> buffer_ptr, LongPtr size_ptr);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_data_create_concat(
			@Mapped(ObjCObjectMapper.class) Object data1,
			@Mapped(ObjCObjectMapper.class) Object data2);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_data_create_subrange(
			@Mapped(ObjCObjectMapper.class) Object data, long offset,
			long length);

	@Generated
	@CFunction
	public static native boolean dispatch_data_apply(
			@Mapped(ObjCObjectMapper.class) Object data,
			@ObjCBlock(name = "call_dispatch_data_apply") Block_dispatch_data_apply applier);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_data_apply {
		@Generated
		public boolean call_dispatch_data_apply(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				ConstVoidPtr arg2, long arg3);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_data_copy_region(
			@Mapped(ObjCObjectMapper.class) Object data, long location,
			LongPtr offset_ptr);

	@Generated
	@CFunction
	public static native void dispatch_read(int fd, long length,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_read") Block_dispatch_read handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_read {
		@Generated
		public void call_dispatch_read(
				@Mapped(ObjCObjectMapper.class) Object arg0, int arg1);
	}

	@Generated
	@CFunction
	public static native void dispatch_write(
			int fd,
			@Mapped(ObjCObjectMapper.class) Object data,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_write") Block_dispatch_write handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_write {
		@Generated
		public void call_dispatch_write(
				@Mapped(ObjCObjectMapper.class) Object arg0, int arg1);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_io_create(
			long type,
			int fd,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_io_create") Block_dispatch_io_create cleanup_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_create {
		@Generated
		public void call_dispatch_io_create(int arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_io_create_with_path(
			long type,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			int oflag,
			short mode,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_io_create_with_path") Block_dispatch_io_create_with_path cleanup_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_create_with_path {
		@Generated
		public void call_dispatch_io_create_with_path(int arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dispatch_io_create_with_io(
			long type,
			@Mapped(ObjCObjectMapper.class) Object io,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_io_create_with_io") Block_dispatch_io_create_with_io cleanup_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_create_with_io {
		@Generated
		public void call_dispatch_io_create_with_io(int arg0);
	}

	@Generated
	@CFunction
	public static native void dispatch_io_read(
			@Mapped(ObjCObjectMapper.class) Object channel,
			long offset,
			long length,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_io_read") Block_dispatch_io_read io_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_read {
		@Generated
		public void call_dispatch_io_read(boolean arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, int arg2);
	}

	@Generated
	@CFunction
	public static native void dispatch_io_write(
			@Mapped(ObjCObjectMapper.class) Object channel,
			long offset,
			@Mapped(ObjCObjectMapper.class) Object data,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_dispatch_io_write") Block_dispatch_io_write io_handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_write {
		@Generated
		public void call_dispatch_io_write(boolean arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, int arg2);
	}

	@Generated
	@CFunction
	public static native void dispatch_io_close(
			@Mapped(ObjCObjectMapper.class) Object channel, long flags);

	@Generated
	@CFunction
	public static native void dispatch_io_barrier(
			@Mapped(ObjCObjectMapper.class) Object channel,
			@ObjCBlock(name = "call_dispatch_io_barrier") Block_dispatch_io_barrier barrier);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_dispatch_io_barrier {
		@Generated
		public void call_dispatch_io_barrier();
	}

	@Generated
	@CFunction
	public static native int dispatch_io_get_descriptor(
			@Mapped(ObjCObjectMapper.class) Object channel);

	@Generated
	@CFunction
	public static native void dispatch_io_set_high_water(
			@Mapped(ObjCObjectMapper.class) Object channel, long high_water);

	@Generated
	@CFunction
	public static native void dispatch_io_set_low_water(
			@Mapped(ObjCObjectMapper.class) Object channel, long low_water);

	@Generated
	@CFunction
	public static native void dispatch_io_set_interval(
			@Mapped(ObjCObjectMapper.class) Object channel, long interval,
			long flags);

	@Generated
	@CFunction
	public static native int mach_host_self();

	@Generated
	@CFunction
	public static native int mach_thread_self();

	@Generated
	@CFunction
	public static native int host_page_size(int arg1, LongPtr arg2);

	@Generated
	@CFunction
	public static native int clock_sleep_trap(
			int clock_name,
			int sleep_type,
			int sleep_sec,
			int sleep_nsec,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_timespec wakeup_time);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_vm_allocate_trap(int target,
			LongPtr addr, long size, int flags);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_vm_deallocate_trap(int target,
			long address, long size);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_vm_protect_trap(int target,
			long address, long size, int set_maximum, int new_protection);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_vm_map_trap(int target,
			LongPtr address, long size, long mask, int flags, int cur_protection);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_allocate_trap(int target,
			int right, IntPtr name);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_destroy_trap(int target,
			int name);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_deallocate_trap(int target,
			int name);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_mod_refs_trap(int target,
			int name, int right, int delta);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_move_member_trap(int target,
			int member, int after);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_insert_right_trap(int target,
			int name, int poly, int polyPoly);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_insert_member_trap(
			int target, int name, int pset);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_extract_member_trap(
			int target, int name, int pset);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_construct_trap(
			int target,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_port_options options,
			long context, IntPtr name);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_destruct_trap(int target,
			int name, int srdelta, long guard);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_guard_trap(int target,
			int name, long guard, int strict);

	@Generated
	@CFunction
	public static native int _kernelrpc_mach_port_unguard_trap(int target,
			int name, long guard);

	@Generated
	@CFunction
	public static native int macx_swapon(long filename, int flags, int size,
			int priority);

	@Generated
	@CFunction
	public static native int macx_swapoff(long filename, int flags);

	@Generated
	@CFunction
	public static native int macx_triggers(int hi_water, int low_water,
			int flags, int alert_port);

	@Generated
	@CFunction
	public static native int macx_backing_store_suspend(int suspend);

	@Generated
	@CFunction
	public static native int macx_backing_store_recovery(int pid);

	@Generated
	@CFunction
	public static native int swtch_pri(int pri);

	@Generated
	@CFunction
	public static native int swtch();

	@Generated
	@CFunction
	public static native int thread_switch(int thread_name, int option,
			int option_time);

	@Generated
	@CFunction
	public static native int task_self_trap();

	@Generated
	@CFunction
	public static native int task_for_pid(int target_tport, int pid, IntPtr t);

	@Generated
	@CFunction
	public static native int task_name_for_pid(int target_tport, int pid,
			IntPtr tn);

	@Generated
	@CFunction
	public static native int pid_for_task(int t, IntPtr x);

	@Generated
	@CFunction
	public static native int feclearexcept(int arg1);

	@Generated
	@CFunction
	public static native int fegetexceptflag(ShortPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int feraiseexcept(int arg1);

	@Generated
	@CFunction
	public static native int fesetexceptflag(ConstShortPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int fetestexcept(int arg1);

	@Generated
	@CFunction
	public static native int fegetround();

	@Generated
	@CFunction
	public static native int fesetround(int arg1);

	@Generated
	@CFunction
	public static native int fegetenv(
			@UncertainArgument("Options: reference, array Fallback: reference") fenv_t arg1);

	@Generated
	@CFunction
	public static native int feholdexcept(
			@UncertainArgument("Options: reference, array Fallback: reference") fenv_t arg1);

	@Generated
	@CFunction
	public static native int fesetenv(
			@UncertainArgument("Options: reference, array Fallback: reference") fenv_t arg1);

	@Generated
	@CFunction
	public static native int feupdateenv(
			@UncertainArgument("Options: reference, array Fallback: reference") fenv_t arg1);

	@Generated
	@CFunction
	public static native int audit(ConstVoidPtr arg1, int arg2);

	@Generated
	@CFunction
	public static native int auditon(int arg1, VoidPtr arg2, int arg3);

	@Generated
	@CFunction
	public static native int auditctl(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int getauid(IntPtr arg1);

	@Generated
	@CFunction
	public static native int setauid(ConstIntPtr arg1);

	@Generated
	@CFunction
	public static native int getaudit_addr(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int setaudit_addr(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr arg1,
			int arg2);

	@Generated
	@Deprecated
	@CFunction
	public static native int getaudit(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo arg1);

	@Generated
	@Deprecated
	@CFunction
	public static native int setaudit(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo arg1);

	@Generated
	@CFunction
	public static native int audit_session_self();

	@Generated
	@CFunction
	public static native int audit_session_join(int port);

	@Generated
	@CFunction
	public static native int audit_session_port(int asid, IntPtr portname);

	@Generated
	@Inline
	@CFunction
	public static native void _xpc_object_validate(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_endpoint_create(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_debugger_api_misuse_info();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_connection_create(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@Mapped(ObjCObjectMapper.class) Object targetq);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_connection_create_mach_service(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@Mapped(ObjCObjectMapper.class) Object targetq, long flags);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_connection_create_from_endpoint(
			@Mapped(ObjCObjectMapper.class) Object endpoint);

	@Generated
	@CFunction
	public static native void xpc_connection_set_target_queue(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@Mapped(ObjCObjectMapper.class) Object targetq);

	@Generated
	@CFunction
	public static native void xpc_connection_set_event_handler(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@ObjCBlock(name = "call_xpc_connection_set_event_handler") Block_xpc_connection_set_event_handler handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_connection_set_event_handler {
		@Generated
		public void call_xpc_connection_set_event_handler(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@CFunction
	public static native void xpc_connection_suspend(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native void xpc_connection_resume(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native void xpc_connection_send_message(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@Mapped(ObjCObjectMapper.class) Object message);

	@Generated
	@CFunction
	public static native void xpc_connection_send_barrier(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@ObjCBlock(name = "call_xpc_connection_send_barrier") Block_xpc_connection_send_barrier barrier);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_connection_send_barrier {
		@Generated
		public void call_xpc_connection_send_barrier();
	}

	@Generated
	@CFunction
	public static native void xpc_connection_send_message_with_reply(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@Mapped(ObjCObjectMapper.class) Object message,
			@Mapped(ObjCObjectMapper.class) Object replyq,
			@ObjCBlock(name = "call_xpc_connection_send_message_with_reply") Block_xpc_connection_send_message_with_reply handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_connection_send_message_with_reply {
		@Generated
		public void call_xpc_connection_send_message_with_reply(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_connection_send_message_with_reply_sync(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@Mapped(ObjCObjectMapper.class) Object message);

	@Generated
	@CFunction
	public static native void xpc_connection_cancel(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_connection_get_name(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native int xpc_connection_get_euid(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native int xpc_connection_get_egid(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native int xpc_connection_get_pid(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native int xpc_connection_get_asid(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native void xpc_connection_set_context(
			@Mapped(ObjCObjectMapper.class) Object connection, VoidPtr context);

	@Generated
	@CFunction
	public static native VoidPtr xpc_connection_get_context(
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native void xpc_connection_set_finalizer_f(
			@Mapped(ObjCObjectMapper.class) Object connection,
			@FunctionPtr(name = "call_xpc_connection_set_finalizer_f") Function_xpc_connection_set_finalizer_f finalizer);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_xpc_connection_set_finalizer_f {
		@Generated
		public void call_xpc_connection_set_finalizer_f(VoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native void xpc_activity_register(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier,
			@Mapped(ObjCObjectMapper.class) Object criteria,
			@ObjCBlock(name = "call_xpc_activity_register") Block_xpc_activity_register handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_activity_register {
		@Generated
		public void call_xpc_activity_register(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_activity_copy_criteria(
			@Mapped(ObjCObjectMapper.class) Object activity);

	@Generated
	@CFunction
	public static native void xpc_activity_set_criteria(
			@Mapped(ObjCObjectMapper.class) Object activity,
			@Mapped(ObjCObjectMapper.class) Object criteria);

	@Generated
	@CFunction
	public static native long xpc_activity_get_state(
			@Mapped(ObjCObjectMapper.class) Object activity);

	@Generated
	@CFunction
	public static native boolean xpc_activity_set_state(
			@Mapped(ObjCObjectMapper.class) Object activity, long state);

	@Generated
	@CFunction
	public static native boolean xpc_activity_should_defer(
			@Mapped(ObjCObjectMapper.class) Object activity);

	@Generated
	@CFunction
	public static native void xpc_activity_unregister(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String identifier);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_retain(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native void xpc_release(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native xpc_type_t xpc_get_type(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_copy(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native boolean xpc_equal(
			@Mapped(ObjCObjectMapper.class) Object object1,
			@Mapped(ObjCObjectMapper.class) Object object2);

	@Generated
	@CFunction
	public static native long xpc_hash(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native BytePtr xpc_copy_description(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_null_create();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_bool_create(boolean value);

	@Generated
	@CFunction
	public static native boolean xpc_bool_get_value(
			@Mapped(ObjCObjectMapper.class) Object xbool);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_int64_create(long value);

	@Generated
	@CFunction
	public static native long xpc_int64_get_value(
			@Mapped(ObjCObjectMapper.class) Object xint);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_uint64_create(long value);

	@Generated
	@CFunction
	public static native long xpc_uint64_get_value(
			@Mapped(ObjCObjectMapper.class) Object xuint);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_double_create(double value);

	@Generated
	@CFunction
	public static native double xpc_double_get_value(
			@Mapped(ObjCObjectMapper.class) Object xdouble);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_date_create(long interval);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_date_create_from_current();

	@Generated
	@CFunction
	public static native long xpc_date_get_value(
			@Mapped(ObjCObjectMapper.class) Object xdate);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_data_create(ConstVoidPtr bytes, long length);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_data_create_with_dispatch_data(
			@Mapped(ObjCObjectMapper.class) Object ddata);

	@Generated
	@CFunction
	public static native long xpc_data_get_length(
			@Mapped(ObjCObjectMapper.class) Object xdata);

	@Generated
	@CFunction
	public static native ConstVoidPtr xpc_data_get_bytes_ptr(
			@Mapped(ObjCObjectMapper.class) Object xdata);

	@Generated
	@CFunction
	public static native long xpc_data_get_bytes(
			@Mapped(ObjCObjectMapper.class) Object xdata, VoidPtr buffer,
			long off, long length);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_string_create(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

	@Generated
	@CFunction
	public static native long xpc_string_get_length(
			@Mapped(ObjCObjectMapper.class) Object xstring);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_string_get_string_ptr(
			@Mapped(ObjCObjectMapper.class) Object xstring);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_uuid_get_bytes(
			@Mapped(ObjCObjectMapper.class) Object xuuid);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_fd_create(int fd);

	@Generated
	@CFunction
	public static native int xpc_fd_dup(
			@Mapped(ObjCObjectMapper.class) Object xfd);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_shmem_create(VoidPtr region, long length);

	@Generated
	@CFunction
	public static native long xpc_shmem_map(
			@Mapped(ObjCObjectMapper.class) Object xshmem, Ptr<VoidPtr> region);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_array_create(ConstPtr<? extends ObjCObject> objects,
			long count);

	@Generated
	@CFunction
	public static native void xpc_array_set_value(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@CFunction
	public static native void xpc_array_append_value(
			@Mapped(ObjCObjectMapper.class) Object xarray,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@CFunction
	public static native long xpc_array_get_count(
			@Mapped(ObjCObjectMapper.class) Object xarray);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_array_get_value(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native boolean xpc_array_apply(
			@Mapped(ObjCObjectMapper.class) Object xarray,
			@ObjCBlock(name = "call_xpc_array_apply") Block_xpc_array_apply applier);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_array_apply {
		@Generated
		public boolean call_xpc_array_apply(long arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@CFunction
	public static native void xpc_array_set_bool(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			boolean value);

	@Generated
	@CFunction
	public static native void xpc_array_set_int64(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			long value);

	@Generated
	@CFunction
	public static native void xpc_array_set_uint64(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			long value);

	@Generated
	@CFunction
	public static native void xpc_array_set_double(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			double value);

	@Generated
	@CFunction
	public static native void xpc_array_set_date(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			long value);

	@Generated
	@CFunction
	public static native void xpc_array_set_data(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			ConstVoidPtr bytes, long length);

	@Generated
	@CFunction
	public static native void xpc_array_set_string(
			@Mapped(ObjCObjectMapper.class) Object xarray,
			long index,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

	@Generated
	@CFunction
	public static native void xpc_array_set_fd(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index, int fd);

	@Generated
	@CFunction
	public static native void xpc_array_set_connection(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native boolean xpc_array_get_bool(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native long xpc_array_get_int64(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native long xpc_array_get_uint64(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native double xpc_array_get_double(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native long xpc_array_get_date(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native ConstVoidPtr xpc_array_get_data(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index,
			LongPtr length);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_array_get_string(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_array_get_uuid(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	public static native int xpc_array_dup_fd(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_array_create_connection(
			@Mapped(ObjCObjectMapper.class) Object xarray, long index);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_dictionary_create(
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] keys,
			ConstPtr<? extends ObjCObject> values, long count);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_dictionary_create_reply(
			@Mapped(ObjCObjectMapper.class) Object original);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_value(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_dictionary_get_value(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native long xpc_dictionary_get_count(
			@Mapped(ObjCObjectMapper.class) Object xdict);

	@Generated
	@CFunction
	public static native boolean xpc_dictionary_apply(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@ObjCBlock(name = "call_xpc_dictionary_apply") Block_xpc_dictionary_apply applier);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_dictionary_apply {
		@Generated
		public boolean call_xpc_dictionary_apply(
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_dictionary_get_remote_connection(
			@Mapped(ObjCObjectMapper.class) Object xdict);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_bool(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			boolean value);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_int64(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			long value);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_uint64(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			long value);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_double(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			double value);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_date(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			long value);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_data(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			ConstVoidPtr bytes, long length);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_string(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_fd(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			int fd);

	@Generated
	@CFunction
	public static native void xpc_dictionary_set_connection(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			@Mapped(ObjCObjectMapper.class) Object connection);

	@Generated
	@CFunction
	public static native boolean xpc_dictionary_get_bool(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native long xpc_dictionary_get_int64(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native long xpc_dictionary_get_uint64(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native double xpc_dictionary_get_double(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native long xpc_dictionary_get_date(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native ConstVoidPtr xpc_dictionary_get_data(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			LongPtr length);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_dictionary_get_string(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String xpc_dictionary_get_uuid(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native int xpc_dictionary_dup_fd(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object xpc_dictionary_create_connection(
			@Mapped(ObjCObjectMapper.class) Object xdict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key);

	@Generated
	@CFunction
	public static native void xpc_main(
			@FunctionPtr(name = "call_xpc_main") Function_xpc_main handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_xpc_main {
		@Generated
		public void call_xpc_main(@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@CFunction
	public static native void xpc_transaction_begin();

	@Generated
	@CFunction
	public static native void xpc_transaction_end();

	@Generated
	@CFunction
	public static native void xpc_set_event_stream_handler(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String stream,
			@Mapped(ObjCObjectMapper.class) Object targetq,
			@ObjCBlock(name = "call_xpc_set_event_stream_handler") Block_xpc_set_event_stream_handler handler);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_xpc_set_event_stream_handler {
		@Generated
		public void call_xpc_set_event_stream_handler(
				@Mapped(ObjCObjectMapper.class) Object arg0);
	}

	@Generated
	@CFunction
	public static native int OSAtomicAdd32(int __theAmount, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicAdd32Barrier(int __theAmount,
			IntPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native int OSAtomicIncrement32(IntPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native int OSAtomicIncrement32Barrier(IntPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native int OSAtomicDecrement32(IntPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native int OSAtomicDecrement32Barrier(IntPtr __theValue);

	@Generated
	@CFunction
	public static native long OSAtomicAdd64(long __theAmount, LongPtr __theValue);

	@Generated
	@CFunction
	public static native long OSAtomicAdd64Barrier(long __theAmount,
			LongPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native long OSAtomicIncrement64(LongPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native long OSAtomicIncrement64Barrier(LongPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native long OSAtomicDecrement64(LongPtr __theValue);

	@Generated
	@Inline
	@CFunction
	public static native long OSAtomicDecrement64Barrier(LongPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicOr32(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicOr32Barrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicOr32Orig(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicOr32OrigBarrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicAnd32(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicAnd32Barrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicAnd32Orig(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicAnd32OrigBarrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicXor32(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicXor32Barrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicXor32Orig(int __theMask, IntPtr __theValue);

	@Generated
	@CFunction
	public static native int OSAtomicXor32OrigBarrier(int __theMask,
			IntPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwap32(int __oldValue,
			int __newValue, IntPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwap32Barrier(
			int __oldValue, int __newValue, IntPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapPtr(VoidPtr __oldValue,
			VoidPtr __newValue, Ptr<VoidPtr> __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapPtrBarrier(
			VoidPtr __oldValue, VoidPtr __newValue, Ptr<VoidPtr> __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapInt(int __oldValue,
			int __newValue, IntPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapIntBarrier(
			int __oldValue, int __newValue, IntPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapLong(long __oldValue,
			long __newValue, LongPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwapLongBarrier(
			long __oldValue, long __newValue, LongPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwap64(long __oldValue,
			long __newValue, LongPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicCompareAndSwap64Barrier(
			long __oldValue, long __newValue, LongPtr __theValue);

	@Generated
	@CFunction
	public static native boolean OSAtomicTestAndSet(int __n,
			VoidPtr __theAddress);

	@Generated
	@CFunction
	public static native boolean OSAtomicTestAndSetBarrier(int __n,
			VoidPtr __theAddress);

	@Generated
	@CFunction
	public static native boolean OSAtomicTestAndClear(int __n,
			VoidPtr __theAddress);

	@Generated
	@CFunction
	public static native boolean OSAtomicTestAndClearBarrier(int __n,
			VoidPtr __theAddress);

	@Generated
	@CFunction
	public static native boolean OSSpinLockTry(IntPtr __lock);

	@Generated
	@CFunction
	public static native void OSSpinLockLock(IntPtr __lock);

	@Generated
	@CFunction
	public static native void OSSpinLockUnlock(IntPtr __lock);

	@Generated
	@CFunction
	public static native void OSAtomicEnqueue(
			VoidPtr __list,
			VoidPtr __new, long __offset);

	@Generated
	@CFunction
	public static native VoidPtr OSAtomicDequeue(
			VoidPtr __list,
			long __offset);

	@Generated
	@CFunction
	public static native void OSMemoryBarrier();

	@Generated
	@CVariable()
	@ByValue
	public static native _RuneLocale _DefaultRuneLocale();

	@Generated
	@CVariable()
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native _RuneLocale _CurrentRuneLocale();

	@Generated
	@CVariable()
	public static native int signgam();

	@Generated
	@CVariable()
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE __stdinp();

	@Generated
	@CVariable()
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE __stdoutp();

	@Generated
	@CVariable()
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native FILE __stderrp();

	@Generated
	@CVariable()
	public static native int sys_nerr();

	@Generated
	@CVariable()
	@ReferenceInfo(type = Byte.class, depth = 2)
	public static native Ptr<ConstBytePtr> sys_errlist();

	@Generated
	@CVariable()
	public static native int __mb_cur_max();

	@Generated
	@CVariable()
	public static native BytePtr suboptarg();

	@Generated
	@CVariable()
	@ReferenceInfo(type = Byte.class, depth = 2)
	public static native Ptr<BytePtr> tzname();

	@Generated
	@CVariable()
	public static native int getdate_err();

	@Generated
	@CVariable()
	public static native long timezone();

	@Generated
	@CVariable()
	public static native int daylight();

	@Generated
	@CVariable()
	public static native BytePtr optarg();

	@Generated
	@CVariable()
	public static native int optind();

	@Generated
	@CVariable()
	public static native int opterr();

	@Generated
	@CVariable()
	public static native int optopt();

	@Generated
	@CVariable()
	public static native int optreset();

	@Generated
	@CVariable()
	@ByValue
	public static native security_token_t KERNEL_SECURITY_TOKEN();

	@Generated
	@CVariable()
	@ByValue
	public static native audit_token_t KERNEL_AUDIT_TOKEN();

	@Generated
	@CVariable()
	public static native int mach_task_self_();

	@Generated
	@CVariable()
	public static native int bootstrap_port();

	@Generated
	@CVariable()
	public static native long vm_page_size();

	@Generated
	@CVariable()
	public static native long vm_page_mask();

	@Generated
	@CVariable()
	public static native int vm_page_shift();

	@Generated
	@CVariable()
	@ByValue
	public static native fenv_t _FE_DFL_ENV();

	@Generated
	@CVariable()
	@ByValue
	public static native fenv_t _FE_DFL_DISABLE_SSE_DENORMS_ENV();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String _xpc_error_key_description();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String _xpc_event_key_name();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_INTERVAL();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_REPEATING();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_DELAY();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_GRACE_PERIOD();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_1_MIN();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_5_MIN();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_15_MIN();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_30_MIN();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_1_HOUR();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_4_HOURS();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_8_HOURS();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_1_DAY();

	@Generated
	@CVariable()
	public static native long XPC_ACTIVITY_INTERVAL_7_DAYS();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_PRIORITY();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_PRIORITY_MAINTENANCE();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_PRIORITY_UTILITY();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_ALLOW_BATTERY();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_REQUIRE_SCREEN_SLEEP();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_REQUIRE_BATTERY_LEVEL();

	@Generated
	@CVariable()
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String XPC_ACTIVITY_REQUIRE_HDD_SPINNING();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object XPC_ACTIVITY_CHECK_IN();
}
