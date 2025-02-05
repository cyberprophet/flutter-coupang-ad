package flutter.coupang.flutter_coupang_ad

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.PluginRegistry

class FlutterCoupangAdPlugin: FlutterPlugin {
    override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        val factory = AdViewFactory(flutterPluginBinding.binaryMessenger, flutterPluginBinding.applicationContext)
        flutterPluginBinding.platformViewRegistry.registerViewFactory("flutter.coupang.ad/CoupangAdView", factory)
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        // 리소스 정리 (필요 시)
    }

    companion object {
        @JvmStatic
        fun registerWith(registrar: PluginRegistry.Registrar) {
            val factory = AdViewFactory(registrar.messenger(), registrar.context())
            registrar.platformViewRegistry().registerViewFactory("flutter.coupang.ad/CoupangAdView", factory)
        }
    }
}
