package flutter.coupang.flutter_coupang_ad

import android.content.Context
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory
import io.flutter.plugin.common.StandardMessageCodec

class AdViewFactory(private val messenger: BinaryMessenger, private val context: Context)
    : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    override fun create(context: Context, id: Int, args: Any?): PlatformView {
        return CoupangAdView(context, messenger, id, args ?: emptyMap<String, Any>())
    }
}
