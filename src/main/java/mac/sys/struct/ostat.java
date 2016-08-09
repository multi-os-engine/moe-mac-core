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

package mac.sys.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ostat extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ostat() {
		super(ostat.class);
	}

	@Generated
	protected ostat(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short st_dev();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSt_dev(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long st_ino();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSt_ino(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short st_mode();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSt_mode(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short st_nlink();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSt_nlink(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short st_uid();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSt_uid(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short st_gid();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSt_gid(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short st_rdev();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSt_rdev(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int st_size();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSt_size(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native timespec st_atimespec();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSt_atimespec(@ByValue timespec value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native timespec st_mtimespec();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setSt_mtimespec(@ByValue timespec value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native timespec st_ctimespec();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setSt_ctimespec(@ByValue timespec value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int st_blksize();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setSt_blksize(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int st_blocks();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setSt_blocks(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int st_flags();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setSt_flags(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int st_gen();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setSt_gen(int value);
}
