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

package mac.sys.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.*;
import mac.sys.opaque.*;
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
	@CFunction
	public static native int chmod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2);

	@Generated
	@CFunction
	public static native int fchmod(int arg1, short arg2);

	@Generated
	@CFunction
	public static native int fstat(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2);

	@Generated
	@CFunction
	public static native int lstat(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2);

	@Generated
	@CFunction
	public static native int mkdir(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2);

	@Generated
	@CFunction
	public static native int mkfifo(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2);

	@Generated
	@CFunction
	public static native int stat(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2);

	@Generated
	@CFunction
	public static native int mknod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2, int arg3);

	@Generated
	@CFunction
	public static native short umask(short arg1);

	@Generated
	@CFunction
	public static native int chflags(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int chmodx_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			filesec_t arg2);

	@Generated
	@CFunction
	public static native int fchflags(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int fchmodx_np(int arg1, filesec_t arg2);

	@Generated
	@CFunction
	public static native int fstatx_np(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2,
			filesec_t arg3);

	@Generated
	@CFunction
	public static native int lchflags(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2);

	@Generated
	@CFunction
	public static native int lchmod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2);

	@Generated
	@CFunction
	public static native int lstatx_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2,
			filesec_t arg3);

	@Generated
	@CFunction
	public static native int mkdirx_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			filesec_t arg2);

	@Generated
	@CFunction
	public static native int mkfifox_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			filesec_t arg2);

	@Generated
	@CFunction
	public static native int statx_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") stat arg2,
			filesec_t arg3);

	@Generated
	@CFunction
	public static native int creat(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			short arg2);

	@Generated
	@CFunction
	public static native int openx_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
			int arg2, filesec_t arg3);

	@Generated
	@CFunction
	public static native int flock(int arg1, int arg2);

	@Generated
	@CFunction
	public static native filesec_t filesec_init();

	@Generated
	@CFunction
	public static native filesec_t filesec_dup(filesec_t arg1);

	@Generated
	@CFunction
	public static native void filesec_free(filesec_t arg1);

	@Generated
	@CFunction
	public static native int filesec_get_property(filesec_t arg1, int arg2,
			VoidPtr arg3);

	@Generated
	@CFunction
	public static native int filesec_query_property(filesec_t arg1, int arg2,
			IntPtr arg3);

	@Generated
	@CFunction
	public static native int filesec_set_property(filesec_t arg1, int arg2,
			ConstVoidPtr arg3);

	@Generated
	@CFunction
	public static native int filesec_unset_property(filesec_t arg1, int arg2);

	@Generated
	@Inline
	@CFunction
	public static native int __darwin_fd_isset(
			int _n,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set _p);

	@Generated
	@CFunction
	public static native IntPtr __error();

	@Generated
	@CFunction
	public static native int getpriority(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int getiopolicy_np(int arg1, int arg2);

	@Generated
	@CFunction
	public static native int getrlimit(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") rlimit arg2);

	@Generated
	@CFunction
	public static native int getrusage(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") rusage arg2);

	@Generated
	@CFunction
	public static native int setpriority(int arg1, int arg2, int arg3);

	@Generated
	@CFunction
	public static native int setiopolicy_np(int arg1, int arg2, int arg3);

	@Generated
	@CFunction
	public static native int setrlimit(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") rlimit arg2);

	@Generated
	@CFunction("wait")
	public static native int wait_c(IntPtr arg1);

	@Generated
	@CFunction
	public static native int waitpid(int arg1, IntPtr arg2, int arg3);

	@Generated
	@CFunction
	public static native int waitid(int arg1, int arg2, VoidPtr arg3, int arg4);

	@Generated
	@CFunction
	public static native int wait3(
			IntPtr arg1,
			int arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") rusage arg3);

	@Generated
	@CFunction
	public static native int wait4(
			int arg1,
			IntPtr arg2,
			int arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") rusage arg4);

	@Generated
	@CFunction
	public static native int pselect(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg4,
			@UncertainArgument("Options: reference, array Fallback: reference") timespec arg5,
			ConstIntPtr arg6);

	@Generated
	@CFunction
	public static native int select(
			int arg1,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg2,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg3,
			@UncertainArgument("Options: reference, array Fallback: reference") fd_set arg4,
			@UncertainArgument("Options: reference, array Fallback: reference") timeval arg5);

	@Generated
	@CFunction
	public static native acl_t acl_dup(acl_t acl);

	@Generated
	@CFunction
	public static native int acl_free(VoidPtr obj_p);

	@Generated
	@CFunction
	public static native acl_t acl_init(int count);

	@Generated
	@CFunction
	public static native int acl_copy_entry(acl_entry_t dest_d,
			acl_entry_t src_d);

	@Generated
	@CFunction
	public static native int acl_create_entry(Ptr<acl_t> acl_p,
			Ptr<acl_entry_t> entry_p);

	@Generated
	@CFunction
	public static native int acl_create_entry_np(Ptr<acl_t> acl_p,
			Ptr<acl_entry_t> entry_p, int entry_index);

	@Generated
	@CFunction
	public static native int acl_delete_entry(acl_t acl, acl_entry_t entry_d);

	@Generated
	@CFunction
	public static native int acl_get_entry(acl_t acl, int entry_id,
			Ptr<acl_entry_t> entry_p);

	@Generated
	@CFunction
	public static native int acl_valid(acl_t acl);

	@Generated
	@CFunction
	public static native int acl_valid_fd_np(int fd, int type, acl_t acl);

	@Generated
	@CFunction
	public static native int acl_valid_file_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			int type, acl_t acl);

	@Generated
	@CFunction
	public static native int acl_valid_link_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			int type, acl_t acl);

	@Generated
	@CFunction
	public static native int acl_add_perm(acl_permset_t permset_d, int perm);

	@Generated
	@CFunction
	public static native int acl_calc_mask(Ptr<acl_t> acl_p);

	@Generated
	@CFunction
	public static native int acl_clear_perms(acl_permset_t permset_d);

	@Generated
	@CFunction
	public static native int acl_delete_perm(acl_permset_t permset_d, int perm);

	@Generated
	@CFunction
	public static native int acl_get_perm_np(acl_permset_t permset_d, int perm);

	@Generated
	@CFunction
	public static native int acl_get_permset(acl_entry_t entry_d,
			Ptr<acl_permset_t> permset_p);

	@Generated
	@CFunction
	public static native int acl_set_permset(acl_entry_t entry_d,
			acl_permset_t permset_d);

	@Generated
	@CFunction
	public static native int acl_maximal_permset_mask_np(LongPtr mask_p);

	@Generated
	@CFunction
	public static native int acl_get_permset_mask_np(acl_entry_t entry_d,
			LongPtr mask_p);

	@Generated
	@CFunction
	public static native int acl_set_permset_mask_np(acl_entry_t entry_d,
			long mask);

	@Generated
	@CFunction
	public static native int acl_add_flag_np(acl_flagset_t flagset_d, int flag);

	@Generated
	@CFunction
	public static native int acl_clear_flags_np(acl_flagset_t flagset_d);

	@Generated
	@CFunction
	public static native int acl_delete_flag_np(acl_flagset_t flagset_d,
			int flag);

	@Generated
	@CFunction
	public static native int acl_get_flag_np(acl_flagset_t flagset_d, int flag);

	@Generated
	@CFunction
	public static native int acl_get_flagset_np(VoidPtr obj_p,
			Ptr<acl_flagset_t> flagset_p);

	@Generated
	@CFunction
	public static native int acl_set_flagset_np(VoidPtr obj_p,
			acl_flagset_t flagset_d);

	@Generated
	@CFunction
	public static native VoidPtr acl_get_qualifier(acl_entry_t entry_d);

	@Generated
	@CFunction
	public static native int acl_get_tag_type(acl_entry_t entry_d,
			IntPtr tag_type_p);

	@Generated
	@CFunction
	public static native int acl_set_qualifier(acl_entry_t entry_d,
			ConstVoidPtr tag_qualifier_p);

	@Generated
	@CFunction
	public static native int acl_set_tag_type(acl_entry_t entry_d, int tag_type);

	@Generated
	@CFunction
	public static native int acl_delete_def_file(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p);

	@Generated
	@CFunction
	public static native acl_t acl_get_fd(int fd);

	@Generated
	@CFunction
	public static native acl_t acl_get_fd_np(int fd, int type);

	@Generated
	@CFunction
	public static native acl_t acl_get_file(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p,
			int type);

	@Generated
	@CFunction
	public static native acl_t acl_get_link_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p,
			int type);

	@Generated
	@CFunction
	public static native int acl_set_fd(int fd, acl_t acl);

	@Generated
	@CFunction
	public static native int acl_set_fd_np(int fd, acl_t acl, int acl_type);

	@Generated
	@CFunction
	public static native int acl_set_file(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p,
			int type, acl_t acl);

	@Generated
	@CFunction
	public static native int acl_set_link_np(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path_p,
			int type, acl_t acl);

	@Generated
	@CFunction
	public static native long acl_copy_ext(VoidPtr buf_p, acl_t acl, long size);

	@Generated
	@CFunction
	public static native long acl_copy_ext_native(VoidPtr buf_p, acl_t acl,
			long size);

	@Generated
	@CFunction
	public static native acl_t acl_copy_int(ConstVoidPtr buf_p);

	@Generated
	@CFunction
	public static native acl_t acl_copy_int_native(ConstVoidPtr buf_p);

	@Generated
	@CFunction
	public static native acl_t acl_from_text(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buf_p);

	@Generated
	@CFunction
	public static native long acl_size(acl_t acl);

	@Generated
	@CFunction
	public static native BytePtr acl_to_text(acl_t acl, LongPtr len_p);

	@Generated
	@CFunction
	public static native int mlockall(int arg1);

	@Generated
	@CFunction
	public static native int munlockall();

	@Generated
	@CFunction
	public static native int mlock(ConstVoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native VoidPtr mmap(VoidPtr arg1, long arg2, int arg3,
			int arg4, int arg5, long arg6);

	@Generated
	@CFunction
	public static native int mprotect(VoidPtr arg1, long arg2, int arg3);

	@Generated
	@CFunction
	public static native int msync(VoidPtr arg1, long arg2, int arg3);

	@Generated
	@CFunction
	public static native int munlock(ConstVoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native int munmap(VoidPtr arg1, long arg2);

	@Generated
	@CFunction
	public static native int shm_unlink(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1);

	@Generated
	@CFunction
	public static native int posix_madvise(VoidPtr arg1, long arg2, int arg3);

	@Generated
	@CFunction
	public static native int madvise(VoidPtr arg1, long arg2, int arg3);

	@Generated
	@CFunction
	public static native int mincore(ConstVoidPtr arg1, long arg2, BytePtr arg3);

	@Generated
	@CFunction
	public static native int minherit(VoidPtr arg1, long arg2, int arg3);
}
