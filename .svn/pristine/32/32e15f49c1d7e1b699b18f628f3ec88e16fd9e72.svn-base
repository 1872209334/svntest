(function (global, factory) {
    typeof exports === 'object' && typeof module !== 'undefined' ? factory(exports, require('@angular/core')) :
    typeof define === 'function' && define.amd ? define('angular2-baidu-map', ['exports', '@angular/core'], factory) :
    (factory((global['angular2-baidu-map'] = {}),global.ng.core));
}(this, (function (exports,core) { 'use strict';

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /**
     * @param {?} obj
     * @return {?}
     */
    function isNull(obj) {
        return obj === null || obj === undefined;
    }
    /**
     * @param {?} obj
     * @return {?}
     */
    function isUndefined(obj) {
        return obj === undefined;
    }
    /**
     * @param {?} obj
     * @return {?}
     */
    function isBoolean(obj) {
        return Object.prototype.toString.call(obj) === '[object Boolean]';
    }
    /**
     * @param {?} obj
     * @return {?}
     */
    function isFunction(obj) {
        return Object.prototype.toString.call(obj) === '[object Function]';
    }
    /**
     * @param {?} obj
     * @return {?}
     */
    function isString(obj) {
        return Object.prototype.toString.call(obj) === '[object String]';
    }
    /**
     * @param {?} obj
     * @return {?}
     */
    function isNumber(obj) {
        return Object.prototype.toString.call(obj) === '[object Number]';
    }
    /**
     * @template T
     * @param {?} obj
     * @param {...?} keys
     * @return {?}
     */
    function omit(obj) {
        var keys = [];
        for (var _i = 1; _i < arguments.length; _i++) {
            keys[_i - 1] = arguments[_i];
        }
        var /** @type {?} */ rawKeys = Object.keys(obj);
        var /** @type {?} */ finalKeys = rawKeys.filter(function (k) { return keys.indexOf(k) < 0; });
        return finalKeys.reduce(function (p, v) {
            p[v] = obj[v];
            return p;
        }, /** @type {?} */ ({}));
    }

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /**
     * @param {?} opts
     * @return {?}
     */
    function toPoint(opts) {
        if (!opts) {
            return new window.BMap.Point();
        }
        return new window.BMap.Point(opts.lng, opts.lat);
    }
    /**
     * @param {?} opts
     * @return {?}
     */
    function toPoints(opts) {
        if (!opts) {
            return [];
        }
        return opts.map(function (p) {
            return new window.BMap.Point(p.lng, p.lat);
        });
    }
    /**
     * @param {?} opts
     * @return {?}
     */
    function toSize(opts) {
        if (!opts) {
            return new window.BMap.Size();
        }
        return new window.BMap.Size(opts.width, opts.height);
    }
    /**
     * @param {?} url
     * @param {?} size
     * @param {?} options
     * @return {?}
     */
    function toIcon(url, size, options) {
        if (!size && !options) {
            return new window.BMap.Icon(url);
        }
        if (!size) {
            return new window.BMap.Icon(url, toSize(size));
        }
        var /** @type {?} */ iconOptions = {
            anchor: toSize(options.anchor),
            imageOffset: toSize(options.imageOffset),
            infoWindowAnchor: toSize(options.infoWindowAnchor),
            printImageUrl: options.printImageUrl
        };
        var /** @type {?} */ icon = new window.BMap.Icon(url, toSize(size), iconOptions);
        if (options.imageSize) {
            icon.setImageSize(toSize(options.imageSize));
        }
        return icon;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toMarkerOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (options.offset) {
            opts.offset = toSize(options.offset);
        }
        if (options.icon) {
            opts.icon = toIcon(options.icon.imageUrl, options.icon.size, options.icon);
        }
        if (!isNull(options.enableMassClear)) {
            opts.enableMassClear = options.enableMassClear;
        }
        if (!isNull(options.enableDragging)) {
            opts.enableDragging = options.enableDragging;
        }
        if (!isNull(options.enableClicking)) {
            opts.enableClicking = options.enableClicking;
        }
        if (!isNull(options.raiseOnDrag)) {
            opts.raiseOnDrag = options.raiseOnDrag;
        }
        if (!isNull(options.draggingCursor)) {
            opts.draggingCursor = options.draggingCursor;
        }
        if (!isNull(options.rotation)) {
            opts.rotation = options.rotation;
        }
        if (!isNull(options.title)) {
            opts.title = options.title;
        }
        if (!isNull(options.shadow)) {
            opts.shadow = toIcon(options.shadow.imageUrl, options.shadow.size, options.shadow);
        }
        return opts;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toNavigationControlOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (!isNull(options.anchor)) {
            opts.anchor = options.anchor;
        }
        if (!isNull(options.enableGeolocation)) {
            opts.enableGeolocation = options.enableGeolocation;
        }
        if (!isNull(options.offset)) {
            opts.offset = toSize(options.offset);
        }
        if (!isNull(options.showZoomInfo)) {
            opts.showZoomInfo = options.showZoomInfo;
        }
        if (!isNull(options.type)) {
            opts.type = options.type;
        }
        return opts;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toOverviewMapControlOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (!isNull(options.anchor)) {
            opts.anchor = options.anchor;
        }
        if (!isNull(options.isOpen)) {
            opts.isOpen = options.isOpen;
        }
        if (!isNull(options.offset)) {
            opts.offset = toSize(options.offset);
        }
        if (!isNull(options.size)) {
            opts.size = toSize(options.size);
        }
        return opts;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toScaleControlOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (!isNull(options.anchor)) {
            opts.anchor = options.anchor;
        }
        if (!isNull(options.offset)) {
            opts.offset = toSize(options.offset);
        }
        return opts;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toMapTypeControlOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (!isNull(options.type)) {
            opts.type = options.type;
        }
        return opts;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toGeolocationOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (!isNull(options.anchor)) {
            opts.anchor = options.anchor;
        }
        if (!isNull(options.offset)) {
            opts.offset = toSize(options.offset);
        }
        if (!isNull(options.enableAutoLocation)) {
            opts.enableAutoLocation = options.enableAutoLocation;
        }
        if (!isNull(options.locationIcon)) {
            opts.locationIcon = toIcon(options.locationIcon.imageUrl, options.locationIcon.size, options.locationIcon);
        }
        if (!isNull(options.showAddressBar)) {
            opts.showAddressBar = options.showAddressBar;
        }
        return opts;
    }
    /**
     * @param {?} style
     * @return {?}
     */
    function toTextIconStyle(style) {
        var /** @type {?} */ realStyle = {
            url: style.url,
            size: toSize(style.size)
        };
        if (style.anchor) {
            realStyle.anchor = toSize(style.anchor);
        }
        if (style.offset) {
            realStyle.offset = toSize(style.offset);
        }
        if (!isNull(style.textSize)) {
            realStyle.textSize = style.textSize;
        }
        if (!isNull(style.textColor)) {
            realStyle.textColor = style.textColor;
        }
        return realStyle;
    }
    /**
     * @param {?} options
     * @return {?}
     */
    function toMarkerClustererOptions(options) {
        var /** @type {?} */ opts = {};
        if (!options) {
            return opts;
        }
        if (options.markers) {
            opts.markers = options.markers.map(function (m) { return new window.BMap.Marker(toPoint(m.point), toMarkerOptions(m.options)); });
        }
        if (!isNull(options.girdSize)) {
            opts.girdSize = options.girdSize;
        }
        if (!isNull(options.maxZoom)) {
            opts.maxZoom = options.maxZoom;
        }
        if (!isNull(options.minClusterSize)) {
            opts.minClusterSize = options.minClusterSize;
        }
        if (!isNull(options.isAverangeCenter)) {
            opts.isAverangeCenter = options.isAverangeCenter;
        }
        if (options.styles) {
            opts.styles = options.styles.filter(function (s) { return s; }).map(function (s) { return toTextIconStyle(s); });
        }
        return opts;
    }

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /**
     * @param {?} obj
     * @param {?} msg
     * @return {?}
     */
    function nullCheck(obj, msg) {
        if (isNull(obj)) {
            throw new Error(msg);
        }
    }

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /** @enum {number} */
    var LOADING_STATE = {
        NON: 0,
        LOADED: 1,
        LOADING: 2,
    };
    LOADING_STATE[LOADING_STATE.NON] = "NON";
    LOADING_STATE[LOADING_STATE.LOADED] = "LOADED";
    LOADING_STATE[LOADING_STATE.LOADING] = "LOADING";
    var ScriptLoaderConfig = (function () {
        function ScriptLoaderConfig() {
            this.ak = '';
        }
        return ScriptLoaderConfig;
    }());
    window._scriptLoadState = {};
    window._loadingCallbacks = {};
    var ScriptLoader = (function () {
        function ScriptLoader() {
        }
        /**
         * @param {?} url
         * @param {?=} isMain
         * @param {?=} cb
         * @return {?}
         */
        ScriptLoader.prototype.load = /**
         * @param {?} url
         * @param {?=} isMain
         * @param {?=} cb
         * @return {?}
         */
            function (url, isMain, cb) {
                if (isMain === void 0) {
                    isMain = false;
                }
                var /** @type {?} */ scriptKey = isString(url) ? url : url['key'];
                var /** @type {?} */ scriptUrls = isString(url) ? [url] : url['scripts'];
                if (window._scriptLoadState[scriptKey] === LOADING_STATE.LOADED) {
                    if (isMain) {
                        switchDisplay('baidu-map .baidu-map-instance', 'block');
                        switchDisplay('baidu-map .baidu-map-offline', 'none');
                    }
                    return cb();
                }
                if (!window._loadingCallbacks[scriptKey]) {
                    window._loadingCallbacks[scriptKey] = [];
                }
                if (window._scriptLoadState[scriptKey] === LOADING_STATE.LOADING) {
                    window._loadingCallbacks[scriptKey].push(cb);
                    return;
                }
                window._scriptLoadState[scriptKey] = LOADING_STATE.LOADING;
                window._loadingCallbacks[scriptKey].push(cb);
                if (isMain) {
                    window.baidumapinit = function () {
                        window._scriptLoadState[scriptKey] = LOADING_STATE.LOADED;
                        switchDisplay('baidu-map .baidu-map-instance', 'block');
                        switchDisplay('baidu-map .baidu-map-offline', 'none');
                        window._loadingCallbacks[scriptKey].forEach(function (c) {
                            c();
                        });
                    };
                }
                appendScriptsTag(scriptKey, scriptUrls, isMain);
            };
        ScriptLoader.decorators = [
            { type: core.Injectable },
        ];
        return ScriptLoader;
    }());
    /**
     * @param {?} scriptKey
     * @param {?} urls
     * @param {?} isMain
     * @return {?}
     */
    function appendScriptsTag(scriptKey, urls, isMain) {
        var /** @type {?} */ leftObj = {
            count: urls.length
        };
        urls.forEach(function (url) {
            appendScriptTag(scriptKey, url, isMain, leftObj);
        });
    }
    /**
     * @param {?} scriptKey
     * @param {?} url
     * @param {?} isMain
     * @param {?} leftObj
     * @return {?}
     */
    function appendScriptTag(scriptKey, url, isMain, leftObj) {
        var /** @type {?} */ script = document.createElement('script');
        script.type = 'text/javascript';
        script.src = url;
        script.onerror = function () {
            if (isMain) {
                switchDisplay('baidu-map .baidu-map-offline', 'block');
                switchDisplay('baidu-map .baidu-map-instance', 'none');
            }
            document.body.removeChild(script);
            setTimeout(function () {
                appendScriptTag(scriptKey, url, isMain, leftObj);
            }, 30000);
        };
        if (!isMain) {
            script.onload = function () {
                leftObj.count--;
                if (leftObj.count) {
                    return;
                }
                window._scriptLoadState[scriptKey] = LOADING_STATE.LOADED;
                window._loadingCallbacks[scriptKey].forEach(function (c) {
                    c();
                });
            };
        }
        document.body.appendChild(script);
    }
    /**
     * @param {?} selector
     * @param {?} state
     * @return {?}
     */
    function switchDisplay(selector, state) {
        Array.prototype.slice.call(document.querySelectorAll(selector)).forEach(function (node) {
            node.style.display = state;
        });
    }

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /** @enum {string} */
    var MapTypeEnum = {
        BMAP_NORMAL_MAP: 'BMAP_NORMAL_MAP',
        BMAP_PERSPECTIVE_MAP: 'BMAP_PERSPECTIVE_MAP',
        BMAP_SATELLITE_MAP: 'BMAP_SATELLITE_MAP',
        BMAP_HYBRID_MAP: 'BMAP_HYBRID_MAP',
    };
    /**
     * @param {?} maptype
     * @return {?}
     */
    function isMapTypeEnum(maptype) {
        return !isFunction(((maptype)).getTileLayer);
    }

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var MapService = (function () {
        function MapService(config, _loader) {
            var _this = this;
            this._loader = _loader;
            nullCheck(config.ak, 'ak must be provided');
            this._config = config;
            this._map = new Promise(function (resolve) {
                _this._mapResolver = resolve;
            });
        }
        /**
         * @param {?} el
         * @param {?} mapOptions
         * @return {?}
         */
        MapService.prototype.createMap = /**
         * @param {?} el
         * @param {?} mapOptions
         * @return {?}
         */
            function (el, mapOptions) {
                var _this = this;
                var /** @type {?} */ URL = "https://api.map.baidu.com/api?v=3.0&ak=" + this._config.ak + "&callback=baidumapinit";
                return new Promise(function (resolve) {
                    _this._loader.load(URL, true, function () {
                        var /** @type {?} */ map = new window.BMap.Map(el, omit(mapOptions, 'mapType'));
                        _this.setOptions(mapOptions);
                        _this._mapResolver(map);
                        resolve(map);
                    });
                });
            };
        /**
         * @param {?} opts
         * @return {?}
         */
        MapService.prototype.setOptions = /**
         * @param {?} opts
         * @return {?}
         */
            function (opts) {
                var disableDragging = opts.disableDragging, enableScrollWheelZoom = opts.enableScrollWheelZoom, disableDoubleClickZoom = opts.disableDoubleClickZoom, enableKeyboard = opts.enableKeyboard, enableInertialDragging = opts.enableInertialDragging, enableAutoResize = opts.enableAutoResize, enableContinuousZoom = opts.enableContinuousZoom, disablePinchToZoom = opts.disablePinchToZoom;
                if (isBoolean(disableDragging)) {
                    this._map.then(function (map) { return map[(disableDragging ? 'disable' : 'enable') + 'Dragging'](); });
                }
                if (isBoolean(enableScrollWheelZoom)) {
                    this._map.then(function (map) { return map[(enableScrollWheelZoom ? 'enable' : 'disable') + 'ScrollWheelZoom'](); });
                }
                if (isBoolean(enableAutoResize)) {
                    this._map.then(function (map) { return map[(enableAutoResize ? 'enable' : 'disable') + 'AutoResize'](); });
                }
                if (isBoolean(disableDoubleClickZoom)) {
                    this._map.then(function (map) { return map[(disableDoubleClickZoom ? 'disable' : 'enable') + 'DoubleClickZoom'](); });
                }
                if (isBoolean(enableKeyboard)) {
                    this._map.then(function (map) { return map[(enableKeyboard ? 'enable' : 'disable') + 'Keyboard'](); });
                }
                if (isBoolean(enableInertialDragging)) {
                    this._map.then(function (map) { return map[(enableInertialDragging ? 'enable' : 'disable') + 'InertialDragging'](); });
                }
                if (isBoolean(enableContinuousZoom)) {
                    this._map.then(function (map) { return map[(enableContinuousZoom ? 'enable' : 'disable') + 'ContinuousZoom'](); });
                }
                if (isBoolean(disablePinchToZoom)) {
                    this._map.then(function (map) { return map[(disablePinchToZoom ? 'disable' : 'enable') + 'PinchToZoom'](); });
                }
                if (!isNull(opts.cursor)) {
                    this._map.then(function (map) { return map.setDefaultCursor(opts.cursor); });
                }
                if (!isNull(opts.draggingCursor)) {
                    this._map.then(function (map) { return map.setDraggingCursor(opts.draggingCursor); });
                }
                if (!isNull(opts.currentCity)) {
                    this._map.then(function (map) { return map.setCurrentCity(opts.currentCity); });
                }
                if (!isNull(opts.centerAndZoom)) {
                    this._map.then(function (map) {
                        map.centerAndZoom(toPoint(opts.centerAndZoom), opts.centerAndZoom.zoom);
                    });
                }
                if (!isNull(opts.mapType)) {
                    this._map.then(function (map) {
                        var /** @type {?} */ realType = isMapTypeEnum(opts.mapType) ? window[opts.mapType] : opts.mapType;
                        map.setMapType(realType);
                    });
                }
            };
        /**
         * @param {?} cb
         * @return {?}
         */
        MapService.prototype.addOverlay = /**
         * @param {?} cb
         * @return {?}
         */
            function (cb) {
                return this._map.then(function (map) {
                    var /** @type {?} */ overlay = cb(map);
                    map.addOverlay(overlay);
                    return { map: map, overlay: overlay };
                });
            };
        /**
         * @param {?} overlay
         * @return {?}
         */
        MapService.prototype.removeOverlay = /**
         * @param {?} overlay
         * @return {?}
         */
            function (overlay) {
                return this._map.then(function (map) {
                    map.removeOverlay(overlay);
                });
            };
        /**
         * @param {?} cb
         * @return {?}
         */
        MapService.prototype.addTileLayer = /**
         * @param {?} cb
         * @return {?}
         */
            function (cb) {
                return this._map.then(function (map) {
                    var /** @type {?} */ tilelayer = cb(map);
                    map.addTileLayer(tilelayer);
                    return { map: map, tilelayer: tilelayer };
                });
            };
        /**
         * @param {?} tilelayer
         * @return {?}
         */
        MapService.prototype.removeTileLayer = /**
         * @param {?} tilelayer
         * @return {?}
         */
            function (tilelayer) {
                return this._map.then(function (map) {
                    map.removeOverlay(tilelayer);
                });
            };
        /**
         * @param {?} cb
         * @return {?}
         */
        MapService.prototype.addControl = /**
         * @param {?} cb
         * @return {?}
         */
            function (cb) {
                return this._map.then(function (map) {
                    var /** @type {?} */ control = cb(map);
                    map.addControl(control);
                    return { map: map, control: control };
                });
            };
        /**
         * @param {?} control
         * @return {?}
         */
        MapService.prototype.removeControl = /**
         * @param {?} control
         * @return {?}
         */
            function (control) {
                return this._map.then(function (map) {
                    map.removeControl(control);
                });
            };
        /**
         * @return {?}
         */
        MapService.prototype.getNativeMap = /**
         * @return {?}
         */
            function () {
                return this._map;
            };
        MapService.decorators = [
            { type: core.Injectable },
        ];
        /** @nocollapse */
        MapService.ctorParameters = function () {
            return [
                { type: ScriptLoaderConfig, decorators: [{ type: core.Inject, args: [ScriptLoaderConfig,] },] },
                { type: ScriptLoader, },
            ];
        };
        return MapService;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var ControlComponent = (function () {
        function ControlComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        ControlComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.type, 'type is required for <control>');
                this._service
                    .addControl(function () {
                    _this.control = _this.createControl(_this.type, _this.options);
                    return _this.control;
                })
                    .then(function (_a) {
                    var control = _a.control;
                    _this.loaded.emit(control);
                });
            };
        /**
         * @return {?}
         */
        ControlComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeControl(this.control);
            };
        /**
         * @param {?} type
         * @param {?} options
         * @return {?}
         */
        ControlComponent.prototype.createControl = /**
         * @param {?} type
         * @param {?} options
         * @return {?}
         */
            function (type, options) {
                if (type === 'navigation') {
                    return new window.BMap.NavigationControl(toNavigationControlOptions(options));
                }
                if (type === 'overviewmap') {
                    return new window.BMap.OverviewMapControl(toOverviewMapControlOptions(options));
                }
                if (type === 'scale') {
                    return new window.BMap.ScaleControl(toScaleControlOptions(options));
                }
                if (type === 'maptype') {
                    return new window.BMap.MapTypeControl(toMapTypeControlOptions(options));
                }
                if (type === 'geolocation') {
                    return new window.BMap.GeolocationControl(toGeolocationOptions(options));
                }
                if (type === 'panorama') {
                    return new window.BMap.PanoramaControl();
                }
                throw new Error("Unsupported type:" + type + " of control");
            };
        ControlComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'control'
                    },] },
        ];
        /** @nocollapse */
        ControlComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        ControlComponent.propDecorators = {
            "type": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return ControlComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var MapComponent = (function () {
        function MapComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
            this.clicked = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        MapComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.options, 'options is required for <baidu-map>');
                nullCheck(this.options.centerAndZoom, 'options.centerAndZoom is required for <baidu-map>');
                this._service
                    .createMap(this.mapInstance.nativeElement, this.options)
                    .then(function (map) {
                    _this.loaded.emit(map);
                    return map;
                })
                    .then(function (map) {
                    _this.addListener(map);
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        MapComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                var /** @type {?} */ opts = (changes["options"].currentValue);
                if (!opts) {
                    return console.warn('MapOptions change was ignored since you are passing empty value');
                }
                this._service.setOptions(opts);
            };
        /**
         * @return {?}
         */
        MapComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                console.log('on map destroy');
            };
        /**
         * @param {?} map
         * @return {?}
         */
        MapComponent.prototype.addListener = /**
         * @param {?} map
         * @return {?}
         */
            function (map) {
                var _this = this;
                map.addEventListener('click', function (e) {
                    _this.clicked.emit(e);
                });
            };
        MapComponent.decorators = [
            { type: core.Component, args: [{
                        providers: [MapService],
                        selector: 'baidu-map',
                        styles: [
                            "\n        .baidu-map-instance {\n            width: 100%;\n            height: 100%;\n            display: none;\n        }\n        .baidu-map-offline {\n            width: 100%;\n            height: 100%;\n            background-color: #E6E6E6;\n            position: relative;\n            display: none;\n        }\n        .baidu-map-offline label {\n            fontSize: 30px;\n            margin: 0;\n            position: absolute;\n            top: 50%;\n            left: 50%;\n            margin-right: -50%;\n            transform: translate(-50%, -50%);\n        }\n        .tranclude-content {\n            display: none;\n        }\n        "
                        ],
                        template: "\n    <div #mapinstance class=\"baidu-map-instance\"></div>\n    <div class=\"baidu-map-offline\">\n        <label>{{ 'NO_NETWORK' }}</label>\n    </div>\n    <div class=\"tranclude-content\">\n        <ng-content></ng-content>\n    </div>\n    "
                    },] },
        ];
        /** @nocollapse */
        MapComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        MapComponent.propDecorators = {
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
            "clicked": [{ type: core.Output },],
            "mapInstance": [{ type: core.ViewChild, args: ['mapinstance',] },],
        };
        return MapComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var MarkerComponent = (function () {
        function MarkerComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
            this.clicked = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        MarkerComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.point, 'point is required for <marker>');
                this._service
                    .addOverlay(function () {
                    return (_this.marker = new window.BMap.Marker(toPoint(_this.point), toMarkerOptions(_this.options)));
                })
                    .then(function (_a) {
                    var map = _a.map;
                    _this.loaded.emit(_this.marker);
                    _this.addListener(_this.marker, map);
                })
                    .then(function () {
                    // workaround: it's weird that postion is set while constructing phase will make click event not working
                    // workaround: it's weird that postion is set while constructing phase will make click event not working
                    _this.marker.setPosition(new window.BMap.Point(_this.point.lng, _this.point.lat));
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        MarkerComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["point"] && !changes["point"].isFirstChange()) {
                    this.marker.setPosition(toPoint(changes["point"].currentValue));
                }
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.setOptions(changes["options"].currentValue);
                }
            };
        /**
         * @return {?}
         */
        MarkerComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.marker);
            };
        /**
         * @param {?} options
         * @return {?}
         */
        MarkerComponent.prototype.setOptions = /**
         * @param {?} options
         * @return {?}
         */
            function (options) {
                if (isNull(options)) {
                    return;
                }
                if (!isNull(options.offset)) {
                    this.marker.setOffset(toSize(options.offset));
                }
                if (!isNull(options.icon)) {
                    this.marker.setIcon(toIcon(options.icon.imageUrl, options.icon.size, options.icon));
                }
                if (!isNull(options.enableMassClear)) {
                    this.marker[(options.enableMassClear ? 'enable' : 'disable') + 'MassClear']();
                }
                if (!isNull(options.enableDragging)) {
                    this.marker[(options.enableDragging ? 'enable' : 'disable') + 'Dragging']();
                }
                if (!isNull(options.rotation)) {
                    this.marker.setRotation(options.rotation);
                }
                if (!isNull(options.shadow)) {
                    this.marker.setShadow(toIcon(options.shadow.imageUrl, options.shadow.size, options.shadow));
                }
                if (!isNull(options.title)) {
                    this.marker.setTitle(options.title);
                }
            };
        /**
         * @param {?} marker
         * @param {?} map
         * @return {?}
         */
        MarkerComponent.prototype.addListener = /**
         * @param {?} marker
         * @param {?} map
         * @return {?}
         */
            function (marker, map) {
                var _this = this;
                marker.addEventListener('click', function (e) {
                    _this.clicked.emit({
                        e: e,
                        map: map,
                        marker: marker
                    });
                });
            };
        MarkerComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'marker'
                    },] },
        ];
        /** @nocollapse */
        MarkerComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        MarkerComponent.propDecorators = {
            "point": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
            "clicked": [{ type: core.Output },],
        };
        return MarkerComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var PolylineComponent = (function () {
        function PolylineComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        PolylineComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.points, 'points is required for <polyline>');
                this._service
                    .addOverlay(function () {
                    return (_this.polyline = new window.BMap.Polyline(toPoints(_this.points), _this.options));
                })
                    .then(function () {
                    _this.loaded.emit(_this.polyline);
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        PolylineComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["points"] && !changes["points"].isFirstChange()) {
                    this.polyline.setPath(toPoints(changes["points"].currentValue));
                }
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.setOptions(changes["options"].currentValue);
                }
            };
        /**
         * @return {?}
         */
        PolylineComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.polyline);
            };
        /**
         * @param {?} options
         * @return {?}
         */
        PolylineComponent.prototype.setOptions = /**
         * @param {?} options
         * @return {?}
         */
            function (options) {
                if (isNull(options)) {
                    return;
                }
                if (!isUndefined(options.enableEditing)) {
                    if (options.enableEditing) {
                        this.polyline.enableEditing();
                    }
                    else {
                        this.polyline.disableEditing();
                    }
                }
                if (!isUndefined(options.enableMassClear)) {
                    if (options.enableEditing) {
                        this.polyline.enableMassClear();
                    }
                    else {
                        this.polyline.disableMassClear();
                    }
                }
                if (!isUndefined(options.strokeColor)) {
                    this.polyline.setStrokeColor(options.strokeColor);
                }
                if (!isUndefined(options.strokeOpacity)) {
                    this.polyline.setStrokeOpacity(options.strokeOpacity);
                }
                if (!isUndefined(options.strokeStyle)) {
                    this.polyline.setStrokeStyle(options.strokeStyle);
                }
                if (!isUndefined(options.strokeWeight)) {
                    this.polyline.setStrokeWeight(options.strokeWeight);
                }
            };
        PolylineComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'polyline'
                    },] },
        ];
        /** @nocollapse */
        PolylineComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        PolylineComponent.propDecorators = {
            "points": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return PolylineComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var CircleComponent = (function () {
        function CircleComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        CircleComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.center, 'center is required for <circle>');
                nullCheck(this.radius, 'center is required for <circle>');
                this._service
                    .addOverlay(function () {
                    return (_this.circle = new window.BMap.Circle(toPoint(_this.center), _this.radius, _this.options));
                })
                    .then(function () {
                    _this.loaded.emit(_this.circle);
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        CircleComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["center"] && !changes["center"].isFirstChange()) {
                    this.circle.setCenter(toPoint(changes["center"].currentValue));
                }
                if (changes["radius"] && !changes["radius"].isFirstChange()) {
                    this.circle.setRadius(changes["radius"].currentValue);
                }
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.setOptions(changes["options"].currentValue);
                }
            };
        /**
         * @return {?}
         */
        CircleComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.circle);
            };
        /**
         * @param {?} options
         * @return {?}
         */
        CircleComponent.prototype.setOptions = /**
         * @param {?} options
         * @return {?}
         */
            function (options) {
                if (isNull(options)) {
                    return;
                }
                if (!isUndefined(options.enableEditing)) {
                    if (options.enableEditing) {
                        this.circle.enableEditing();
                    }
                    else {
                        this.circle.disableEditing();
                    }
                }
                if (!isUndefined(options.enableMassClear)) {
                    if (options.enableEditing) {
                        this.circle.enableMassClear();
                    }
                    else {
                        this.circle.disableMassClear();
                    }
                }
                if (!isUndefined(options.strokeColor)) {
                    this.circle.setStrokeColor(options.strokeColor);
                }
                if (!isUndefined(options.fillColor)) {
                    this.circle.setFillColor(options.fillColor);
                }
                if (!isUndefined(options.strokeOpacity)) {
                    this.circle.setStrokeOpacity(options.strokeOpacity);
                }
                if (!isUndefined(options.fillOpacity)) {
                    this.circle.setFillOpacity(options.fillOpacity);
                }
                if (!isUndefined(options.strokeStyle)) {
                    this.circle.setStrokeStyle(options.strokeStyle);
                }
                if (!isUndefined(options.strokeWeight)) {
                    this.circle.setStrokeWeight(options.strokeWeight);
                }
            };
        CircleComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'circle'
                    },] },
        ];
        /** @nocollapse */
        CircleComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        CircleComponent.propDecorators = {
            "center": [{ type: core.Input },],
            "radius": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return CircleComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var PolygonComponent = (function () {
        function PolygonComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        PolygonComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.points, 'points is required for <polygon>');
                this._service
                    .addOverlay(function () {
                    return (_this.polygon = new window.BMap.Polygon(toPoints(_this.points), _this.options));
                })
                    .then(function () {
                    _this.loaded.emit(_this.polygon);
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        PolygonComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["points"] && !changes["points"].isFirstChange()) {
                    this.polygon.setPath(toPoints(changes["points"].currentValue));
                }
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.setOptions(changes["options"].currentValue);
                }
            };
        /**
         * @return {?}
         */
        PolygonComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.polygon);
            };
        /**
         * @param {?} options
         * @return {?}
         */
        PolygonComponent.prototype.setOptions = /**
         * @param {?} options
         * @return {?}
         */
            function (options) {
                if (isNull(options)) {
                    return;
                }
                if (!isUndefined(options.enableEditing)) {
                    if (options.enableEditing) {
                        this.polygon.enableEditing();
                    }
                    else {
                        this.polygon.disableEditing();
                    }
                }
                if (!isUndefined(options.enableMassClear)) {
                    if (options.enableEditing) {
                        this.polygon.enableMassClear();
                    }
                    else {
                        this.polygon.disableMassClear();
                    }
                }
                if (!isUndefined(options.strokeColor)) {
                    this.polygon.setStrokeColor(options.strokeColor);
                }
                if (!isUndefined(options.fillColor)) {
                    this.polygon.setFillColor(options.fillColor);
                }
                if (!isUndefined(options.strokeOpacity)) {
                    this.polygon.setStrokeOpacity(options.strokeOpacity);
                }
                if (!isUndefined(options.fillOpacity)) {
                    this.polygon.setFillOpacity(options.fillOpacity);
                }
                if (!isUndefined(options.strokeStyle)) {
                    this.polygon.setStrokeStyle(options.strokeStyle);
                }
                if (!isUndefined(options.strokeWeight)) {
                    this.polygon.setStrokeWeight(options.strokeWeight);
                }
            };
        PolygonComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'polygon'
                    },] },
        ];
        /** @nocollapse */
        PolygonComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        PolygonComponent.propDecorators = {
            "points": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return PolygonComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var /** @type {?} */ LIB_URL = "https://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js";
    var HeatmapComponent = (function () {
        function HeatmapComponent(_service, scriptLoader) {
            this._service = _service;
            this.scriptLoader = scriptLoader;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        HeatmapComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.dataset, 'dataset is required for <heatmap>');
                this._service.getNativeMap().then(function () {
                    return _this.scriptLoader.load(LIB_URL, false, function () {
                        _this._service
                            .addOverlay(function () {
                            return (_this.heatmap = new window.BMapLib.HeatmapOverlay(_this.options));
                        })
                            .then(function () {
                            _this.loaded.emit(_this.heatmap);
                            if (_this.dataset) {
                                _this.heatmap.setDataSet(_this.dataset);
                            }
                        });
                    });
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        HeatmapComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["dataset"] && !changes["dataset"].isFirstChange()) {
                    this.heatmap.setDataSet(changes["dataset"].currentValue);
                }
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.heatmap.setOptions(changes["options"].currentValue);
                }
            };
        /**
         * @return {?}
         */
        HeatmapComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.heatmap);
            };
        HeatmapComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'heatmap'
                    },] },
        ];
        /** @nocollapse */
        HeatmapComponent.ctorParameters = function () {
            return [
                { type: MapService, },
                { type: ScriptLoader, },
            ];
        };
        HeatmapComponent.propDecorators = {
            "dataset": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return HeatmapComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var TileLayerComponent = (function () {
        function TileLayerComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        TileLayerComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                var /** @type {?} */ func = this.getTilesUrl;
                this._service
                    .addTileLayer(function () {
                    _this.tilelayer = new window.BMap.TileLayer(_this.options);
                    if (_this.getTilesUrl) {
                        _this.tilelayer.getTilesUrl = function (tileCoord, zoom) {
                            return func(tileCoord, zoom);
                        };
                    }
                    return _this.tilelayer;
                })
                    .then(function () {
                    _this.loaded.emit(_this.tilelayer);
                });
            };
        /**
         * @return {?}
         */
        TileLayerComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeTileLayer(this.tilelayer);
            };
        TileLayerComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'tilelayer'
                    },] },
        ];
        /** @nocollapse */
        TileLayerComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        TileLayerComponent.propDecorators = {
            "getTilesUrl": [{ type: core.Input },],
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return TileLayerComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var TrafficLayerComponent = (function () {
        function TrafficLayerComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        TrafficLayerComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                this._service
                    .addTileLayer(function () {
                    _this.trafficlayer = new window.BMap.TrafficLayer(_this.options);
                    return _this.trafficlayer;
                })
                    .then(function () {
                    _this.loaded.emit(_this.trafficlayer);
                });
            };
        /**
         * @return {?}
         */
        TrafficLayerComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeTileLayer(this.trafficlayer);
            };
        TrafficLayerComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'trafficlayer'
                    },] },
        ];
        /** @nocollapse */
        TrafficLayerComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        TrafficLayerComponent.propDecorators = {
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return TrafficLayerComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var CanvasLayerComponent = (function () {
        function CanvasLayerComponent(_service) {
            this._service = _service;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        CanvasLayerComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                this._service
                    .addOverlay(function (map) {
                    _this.canvaslayer = new window.BMap.CanvasLayer(_this.getOptions(_this.options, map));
                    return _this.canvaslayer;
                })
                    .then(function () {
                    _this.loaded.emit(_this.canvaslayer);
                });
            };
        /**
         * @return {?}
         */
        CanvasLayerComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this._service.removeOverlay(this.canvaslayer);
            };
        /**
         * @param {?} options
         * @param {?} map
         * @return {?}
         */
        CanvasLayerComponent.prototype.getOptions = /**
         * @param {?} options
         * @param {?} map
         * @return {?}
         */
            function (options, map) {
                if (!options) {
                    return;
                }
                var /** @type {?} */ opts = {};
                if (isNumber(options.zIndex)) {
                    opts.zIndex = options.zIndex;
                }
                if (options.paneName) {
                    opts.paneName = options.paneName;
                }
                if (options.update) {
                    opts.update = function () {
                        return options.update(map, this.canvas);
                    };
                }
                return opts;
            };
        CanvasLayerComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'canvaslayer'
                    },] },
        ];
        /** @nocollapse */
        CanvasLayerComponent.ctorParameters = function () {
            return [
                { type: MapService, },
            ];
        };
        CanvasLayerComponent.propDecorators = {
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return CanvasLayerComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var /** @type {?} */ LIB_URLS = {
        key: 'markerClusterer',
        scripts: [
            'https://api.map.baidu.com/library/MarkerClusterer/1.2/src/MarkerClusterer_min.js',
            'https://api.map.baidu.com/library/TextIconOverlay/1.2/src/TextIconOverlay_min.js'
        ]
    };
    var MarkerClustererComponent = (function () {
        function MarkerClustererComponent(_service, scriptLoader) {
            this._service = _service;
            this.scriptLoader = scriptLoader;
            this.loaded = new core.EventEmitter();
        }
        /**
         * @return {?}
         */
        MarkerClustererComponent.prototype.ngOnInit = /**
         * @return {?}
         */
            function () {
                var _this = this;
                nullCheck(this.options, 'options is required for <marker-clusterer>');
                this._service.getNativeMap().then(function (map) {
                    return _this.scriptLoader.load(LIB_URLS, false, function () {
                        _this.markerClusterer = new window.BMapLib.MarkerClusterer(map, toMarkerClustererOptions(_this.options));
                        _this.loaded.emit(_this.markerClusterer);
                    });
                });
            };
        /**
         * @param {?} changes
         * @return {?}
         */
        MarkerClustererComponent.prototype.ngOnChanges = /**
         * @param {?} changes
         * @return {?}
         */
            function (changes) {
                if (changes["options"] && !changes["options"].isFirstChange()) {
                    this.resetOptions(changes["options"].currentValue);
                }
            };
        /**
         * @param {?} options
         * @return {?}
         */
        MarkerClustererComponent.prototype.resetOptions = /**
         * @param {?} options
         * @return {?}
         */
            function (options) {
                if (options.markers) {
                    this.markerClusterer.clearMarkers();
                    this.markerClusterer.addMarkers(options.markers.map(function (m) { return new window.BMap.Marker(toPoint(m.point), toMarkerOptions(m.options)); }));
                }
                if (!isUndefined(options.girdSize)) {
                    this.markerClusterer.setGridSize(options.girdSize);
                }
                if (!isUndefined(options.maxZoom)) {
                    this.markerClusterer.setMaxZoom(options.maxZoom);
                }
                if (options.styles) {
                    this.markerClusterer.setStyles(options.styles.filter(function (s) { return s; }).map(function (s) { return toTextIconStyle(s); }));
                }
            };
        /**
         * @return {?}
         */
        MarkerClustererComponent.prototype.ngOnDestroy = /**
         * @return {?}
         */
            function () {
                this.markerClusterer.clearMarkers();
            };
        MarkerClustererComponent.decorators = [
            { type: core.Directive, args: [{
                        selector: 'marker-clusterer'
                    },] },
        ];
        /** @nocollapse */
        MarkerClustererComponent.ctorParameters = function () {
            return [
                { type: MapService, },
                { type: ScriptLoader, },
            ];
        };
        MarkerClustererComponent.propDecorators = {
            "options": [{ type: core.Input },],
            "loaded": [{ type: core.Output },],
        };
        return MarkerClustererComponent;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /** @enum {number} */
    var ControlAnchor = {
        BMAP_ANCHOR_TOP_LEFT: 0,
        BMAP_ANCHOR_TOP_RIGHT: 1,
        BMAP_ANCHOR_BOTTOM_LEFT: 2,
        BMAP_ANCHOR_BOTTOM_RIGHT: 3,
    };
    ControlAnchor[ControlAnchor.BMAP_ANCHOR_TOP_LEFT] = "BMAP_ANCHOR_TOP_LEFT";
    ControlAnchor[ControlAnchor.BMAP_ANCHOR_TOP_RIGHT] = "BMAP_ANCHOR_TOP_RIGHT";
    ControlAnchor[ControlAnchor.BMAP_ANCHOR_BOTTOM_LEFT] = "BMAP_ANCHOR_BOTTOM_LEFT";
    ControlAnchor[ControlAnchor.BMAP_ANCHOR_BOTTOM_RIGHT] = "BMAP_ANCHOR_BOTTOM_RIGHT";
    /** @enum {number} */
    var NavigationControlType = {
        BMAP_NAVIGATION_CONTROL_LARGE: 0,
        BMAP_NAVIGATION_CONTROL_SMALL: 1,
        BMAP_NAVIGATION_CONTROL_PAN: 2,
        BMAP_NAVIGATION_CONTROL_ZOOM: 3,
    };
    NavigationControlType[NavigationControlType.BMAP_NAVIGATION_CONTROL_LARGE] = "BMAP_NAVIGATION_CONTROL_LARGE";
    NavigationControlType[NavigationControlType.BMAP_NAVIGATION_CONTROL_SMALL] = "BMAP_NAVIGATION_CONTROL_SMALL";
    NavigationControlType[NavigationControlType.BMAP_NAVIGATION_CONTROL_PAN] = "BMAP_NAVIGATION_CONTROL_PAN";
    NavigationControlType[NavigationControlType.BMAP_NAVIGATION_CONTROL_ZOOM] = "BMAP_NAVIGATION_CONTROL_ZOOM";
    /** @enum {number} */
    var MapTypeControlType = {
        BMAP_MAPTYPE_CONTROL_HORIZONTAL: 0,
        BMAP_MAPTYPE_CONTROL_DROPDOWN: 1,
        BMAP_MAPTYPE_CONTROL_MAP: 2,
    };
    MapTypeControlType[MapTypeControlType.BMAP_MAPTYPE_CONTROL_HORIZONTAL] = "BMAP_MAPTYPE_CONTROL_HORIZONTAL";
    MapTypeControlType[MapTypeControlType.BMAP_MAPTYPE_CONTROL_DROPDOWN] = "BMAP_MAPTYPE_CONTROL_DROPDOWN";
    MapTypeControlType[MapTypeControlType.BMAP_MAPTYPE_CONTROL_MAP] = "BMAP_MAPTYPE_CONTROL_MAP";
    /** @enum {string} */
    var LengthUnit = {
        BMAP_UNIT_METRIC: 'metric',
        BMAP_UNIT_IMPERIAL: 'us',
    };

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    /** @enum {number} */
    var Animation = {
        BMAP_ANIMATION_DROP: 1,
        BMAP_ANIMATION_BOUNCE: 2,
    };
    Animation[Animation.BMAP_ANIMATION_DROP] = "BMAP_ANIMATION_DROP";
    Animation[Animation.BMAP_ANIMATION_BOUNCE] = "BMAP_ANIMATION_BOUNCE";

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */
    var BaiduMapModule = (function () {
        function BaiduMapModule() {
        }
        /**
         * @param {?=} _config
         * @return {?}
         */
        BaiduMapModule.forRoot = /**
         * @param {?=} _config
         * @return {?}
         */
            function (_config) {
                return {
                    ngModule: BaiduMapModule,
                    providers: [{ provide: ScriptLoaderConfig, useValue: _config }, ScriptLoader]
                };
            };
        BaiduMapModule.decorators = [
            { type: core.NgModule, args: [{
                        declarations: [
                            MapComponent,
                            MarkerComponent,
                            ControlComponent,
                            PolylineComponent,
                            CircleComponent,
                            PolygonComponent,
                            HeatmapComponent,
                            TileLayerComponent,
                            TrafficLayerComponent,
                            CanvasLayerComponent,
                            MarkerClustererComponent
                        ],
                        exports: [
                            MapComponent,
                            MarkerComponent,
                            ControlComponent,
                            PolylineComponent,
                            CircleComponent,
                            PolygonComponent,
                            HeatmapComponent,
                            TileLayerComponent,
                            TrafficLayerComponent,
                            CanvasLayerComponent,
                            MarkerClustererComponent
                        ]
                    },] },
        ];
        return BaiduMapModule;
    }());

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */

    /**
     * @fileoverview added by tsickle
     * @suppress {checkTypes} checked by tsc
     */

    exports.BaiduMapModule = BaiduMapModule;
    exports.MapTypeEnum = MapTypeEnum;
    exports.ControlAnchor = ControlAnchor;
    exports.LengthUnit = LengthUnit;
    exports.NavigationControlType = NavigationControlType;
    exports.MapTypeControlType = MapTypeControlType;
    exports.Animation = Animation;
    exports.ɵm = CanvasLayerComponent;
    exports.ɵh = CircleComponent;
    exports.ɵf = ControlComponent;
    exports.ɵj = HeatmapComponent;
    exports.ɵa = MapComponent;
    exports.ɵe = MarkerComponent;
    exports.ɵn = MarkerClustererComponent;
    exports.ɵi = PolygonComponent;
    exports.ɵg = PolylineComponent;
    exports.ɵk = TileLayerComponent;
    exports.ɵl = TrafficLayerComponent;
    exports.ɵb = MapService;
    exports.ɵd = ScriptLoader;
    exports.ɵc = ScriptLoaderConfig;

    Object.defineProperty(exports, '__esModule', { value: true });

})));

//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiYW5ndWxhcjItYmFpZHUtbWFwLnVtZC5qcy5tYXAiLCJzb3VyY2VzIjpbIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2hlbHBlcnMvb2JqZWN0LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvaGVscGVycy90cmFuc2Zvcm1lci50cyIsIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2hlbHBlcnMvdmFsaWRhdGUudHMiLCJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC9wcm92aWRlcnMvc2NyaXB0TG9hZGVyLnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvdHlwZXMvTWFwLnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvcHJvdmlkZXJzL21hcFNlcnZpY2UudHMiLCJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC9jb21wb25lbnRzL2NvbnRyb2wuY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvY29tcG9uZW50cy9tYXAuY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvY29tcG9uZW50cy9tYXJrZXIuY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvY29tcG9uZW50cy9wb2x5bGluZS5jb21wb25lbnQudHMiLCJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC9jb21wb25lbnRzL2NpcmNsZS5jb21wb25lbnQudHMiLCJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC9jb21wb25lbnRzL3BvbHlnb24uY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvY29tcG9uZW50cy9oZWF0bWFwLmNvbXBvbmVudC50cyIsIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2NvbXBvbmVudHMvdGlsZWxheWVyLmNvbXBvbmVudC50cyIsIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2NvbXBvbmVudHMvdHJhZmZpY2xheWVyLmNvbXBvbmVudC50cyIsIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2NvbXBvbmVudHMvY2FudmFzbGF5ZXIuY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvY29tcG9uZW50cy9tYXJrZXJDbHVzdGVyZXIuY29tcG9uZW50LnRzIiwibmc6Ly9hbmd1bGFyMi1iYWlkdS1tYXAvdHlwZXMvQ29udHJvbC50cyIsIm5nOi8vYW5ndWxhcjItYmFpZHUtbWFwL2luZGV4LnRzIl0sInNvdXJjZXNDb250ZW50IjpbImV4cG9ydCBmdW5jdGlvbiBpc051bGwob2JqOiBhbnkpIHtcbiAgcmV0dXJuIG9iaiA9PT0gbnVsbCB8fCBvYmogPT09IHVuZGVmaW5lZFxufVxuXG5leHBvcnQgZnVuY3Rpb24gaXNVbmRlZmluZWQob2JqOiBhbnkpIHtcbiAgcmV0dXJuIG9iaiA9PT0gdW5kZWZpbmVkXG59XG5cbmV4cG9ydCBmdW5jdGlvbiBpc0Jvb2xlYW4ob2JqOiBhbnkpOiBvYmogaXMgYm9vbGVhbiB7XG4gIHJldHVybiBPYmplY3QucHJvdG90eXBlLnRvU3RyaW5nLmNhbGwob2JqKSA9PT0gJ1tvYmplY3QgQm9vbGVhbl0nXG59XG5cbmV4cG9ydCBmdW5jdGlvbiBpc0Z1bmN0aW9uKG9iajogYW55KTogb2JqIGlzIGJvb2xlYW4ge1xuICByZXR1cm4gT2JqZWN0LnByb3RvdHlwZS50b1N0cmluZy5jYWxsKG9iaikgPT09ICdbb2JqZWN0IEZ1bmN0aW9uXSdcbn1cblxuZXhwb3J0IGZ1bmN0aW9uIGlzU3RyaW5nKG9iajogYW55KTogb2JqIGlzIGJvb2xlYW4ge1xuICByZXR1cm4gT2JqZWN0LnByb3RvdHlwZS50b1N0cmluZy5jYWxsKG9iaikgPT09ICdbb2JqZWN0IFN0cmluZ10nXG59XG5cbmV4cG9ydCBmdW5jdGlvbiBpc051bWJlcihvYmo6IGFueSk6IG9iaiBpcyBib29sZWFuIHtcbiAgcmV0dXJuIE9iamVjdC5wcm90b3R5cGUudG9TdHJpbmcuY2FsbChvYmopID09PSAnW29iamVjdCBOdW1iZXJdJ1xufVxuXG5leHBvcnQgZnVuY3Rpb24gb21pdDxUPihvYmo6IFQsIC4uLmtleXM6IEFycmF5PHN0cmluZz4pOiBUIHtcbiAgY29uc3QgcmF3S2V5cyA9IE9iamVjdC5rZXlzKG9iailcbiAgY29uc3QgZmluYWxLZXlzID0gcmF3S2V5cy5maWx0ZXIoayA9PiBrZXlzLmluZGV4T2YoaykgPCAwKVxuICByZXR1cm4gZmluYWxLZXlzLnJlZHVjZShcbiAgICAocCwgdikgPT4ge1xuICAgICAgcFt2XSA9IG9ialt2XVxuICAgICAgcmV0dXJuIHBcbiAgICB9LFxuICAgIDxUPnt9XG4gIClcbn1cbiIsImltcG9ydCB7XG4gIEJHZW9sb2NhdGlvbkNvbnRyb2xPcHRpb25zLFxuICBCTWFwVHlwZUNvbnRyb2xPcHRpb25zLFxuICBCTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zLFxuICBCT3ZlcnZpZXdNYXBDb250cm9sT3B0aW9ucyxcbiAgQlNjYWxlQ29udHJvbE9wdGlvbnMsXG4gIEdlb2xvY2F0aW9uQ29udHJvbE9wdGlvbnMsXG4gIE1hcFR5cGVDb250cm9sT3B0aW9ucyxcbiAgTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zLFxuICBPdmVydmlld01hcENvbnRyb2xPcHRpb25zLFxuICBTY2FsZUNvbnRyb2xPcHRpb25zXG59IGZyb20gJy4uL3R5cGVzL0NvbnRyb2wnXG5pbXBvcnQgeyBCSWNvbiwgSWNvbk9wdGlvbnMgfSBmcm9tICcuLi90eXBlcy9JY29uJ1xuaW1wb3J0IHsgQk1hcmtlck9wdGlvbnMsIE1hcmtlck9wdGlvbnMgfSBmcm9tICcuLi90eXBlcy9NYXJrZXInXG5pbXBvcnQgeyBCUG9pbnQsIFBvaW50IH0gZnJvbSAnLi4vdHlwZXMvUG9pbnQnXG5pbXBvcnQgeyBCU2l6ZSwgU2l6ZSB9IGZyb20gJy4uL3R5cGVzL1NpemUnXG5cbmltcG9ydCB7IGlzTnVsbCB9IGZyb20gJy4vb2JqZWN0J1xuaW1wb3J0IHsgQk1hcmtlckNsdXN0ZXJlck9wdGlvbnMsIE1hcmtlckNsdXN0ZXJlck9wdGlvbnMgfSBmcm9tICcuLi90eXBlcy9NYXJrZXJDbHVzdGVyZXInXG5pbXBvcnQgeyBUZXh0SWNvblN0eWxlLCBCVGV4dEljb25TdHlsZSB9IGZyb20gJy4uL3R5cGVzL1RleHRJY29uT3ZlcmxheSdcblxuZXhwb3J0IGZ1bmN0aW9uIHRvUG9pbnQob3B0czogUG9pbnQpOiBCUG9pbnQge1xuICBpZiAoIW9wdHMpIHtcbiAgICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLlBvaW50KClcbiAgfVxuICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLlBvaW50KG9wdHMubG5nLCBvcHRzLmxhdClcbn1cblxuZXhwb3J0IGZ1bmN0aW9uIHRvUG9pbnRzKG9wdHM6IEFycmF5PFBvaW50Pik6IEFycmF5PEJQb2ludD4ge1xuICBpZiAoIW9wdHMpIHtcbiAgICByZXR1cm4gW11cbiAgfVxuICByZXR1cm4gb3B0cy5tYXAocCA9PiB7XG4gICAgcmV0dXJuIG5ldyB3aW5kb3cuQk1hcC5Qb2ludChwLmxuZywgcC5sYXQpXG4gIH0pXG59XG5cbmV4cG9ydCBmdW5jdGlvbiB0b1NpemUob3B0czogU2l6ZSk6IEJTaXplIHtcbiAgaWYgKCFvcHRzKSB7XG4gICAgcmV0dXJuIG5ldyB3aW5kb3cuQk1hcC5TaXplKClcbiAgfVxuICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLlNpemUob3B0cy53aWR0aCwgb3B0cy5oZWlnaHQpXG59XG5cbmV4cG9ydCBmdW5jdGlvbiB0b0ljb24odXJsOiBzdHJpbmcsIHNpemU6IFNpemUsIG9wdGlvbnM6IEljb25PcHRpb25zKTogQkljb24ge1xuICBpZiAoIXNpemUgJiYgIW9wdGlvbnMpIHtcbiAgICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLkljb24odXJsKVxuICB9XG4gIGlmICghc2l6ZSkge1xuICAgIHJldHVybiBuZXcgd2luZG93LkJNYXAuSWNvbih1cmwsIHRvU2l6ZShzaXplKSlcbiAgfVxuICBjb25zdCBpY29uT3B0aW9uczogYW55ID0ge1xuICAgIGFuY2hvcjogdG9TaXplKG9wdGlvbnMuYW5jaG9yKSxcbiAgICBpbWFnZU9mZnNldDogdG9TaXplKG9wdGlvbnMuaW1hZ2VPZmZzZXQpLFxuICAgIGluZm9XaW5kb3dBbmNob3I6IHRvU2l6ZShvcHRpb25zLmluZm9XaW5kb3dBbmNob3IpLFxuICAgIHByaW50SW1hZ2VVcmw6IG9wdGlvbnMucHJpbnRJbWFnZVVybFxuICB9XG4gIGNvbnN0IGljb24gPSBuZXcgd2luZG93LkJNYXAuSWNvbih1cmwsIHRvU2l6ZShzaXplKSwgaWNvbk9wdGlvbnMpXG4gIGlmIChvcHRpb25zLmltYWdlU2l6ZSkge1xuICAgIGljb24uc2V0SW1hZ2VTaXplKHRvU2l6ZShvcHRpb25zLmltYWdlU2l6ZSkpXG4gIH1cbiAgcmV0dXJuIGljb25cbn1cblxuZXhwb3J0IGZ1bmN0aW9uIHRvTWFya2VyT3B0aW9ucyhvcHRpb25zOiBNYXJrZXJPcHRpb25zKTogQk1hcmtlck9wdGlvbnMge1xuICBjb25zdCBvcHRzOiBCTWFya2VyT3B0aW9ucyA9IHt9XG5cbiAgaWYgKCFvcHRpb25zKSB7XG4gICAgcmV0dXJuIG9wdHNcbiAgfVxuXG4gIGlmIChvcHRpb25zLm9mZnNldCkge1xuICAgIG9wdHMub2Zmc2V0ID0gdG9TaXplKG9wdGlvbnMub2Zmc2V0KVxuICB9XG5cbiAgaWYgKG9wdGlvbnMuaWNvbikge1xuICAgIG9wdHMuaWNvbiA9IHRvSWNvbihvcHRpb25zLmljb24uaW1hZ2VVcmwsIG9wdGlvbnMuaWNvbi5zaXplLCBvcHRpb25zLmljb24pXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5lbmFibGVNYXNzQ2xlYXIpKSB7XG4gICAgb3B0cy5lbmFibGVNYXNzQ2xlYXIgPSBvcHRpb25zLmVuYWJsZU1hc3NDbGVhclxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMuZW5hYmxlRHJhZ2dpbmcpKSB7XG4gICAgb3B0cy5lbmFibGVEcmFnZ2luZyA9IG9wdGlvbnMuZW5hYmxlRHJhZ2dpbmdcbiAgfVxuICBpZiAoIWlzTnVsbChvcHRpb25zLmVuYWJsZUNsaWNraW5nKSkge1xuICAgIG9wdHMuZW5hYmxlQ2xpY2tpbmcgPSBvcHRpb25zLmVuYWJsZUNsaWNraW5nXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5yYWlzZU9uRHJhZykpIHtcbiAgICBvcHRzLnJhaXNlT25EcmFnID0gb3B0aW9ucy5yYWlzZU9uRHJhZ1xuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMuZHJhZ2dpbmdDdXJzb3IpKSB7XG4gICAgb3B0cy5kcmFnZ2luZ0N1cnNvciA9IG9wdGlvbnMuZHJhZ2dpbmdDdXJzb3JcbiAgfVxuICBpZiAoIWlzTnVsbChvcHRpb25zLnJvdGF0aW9uKSkge1xuICAgIG9wdHMucm90YXRpb24gPSBvcHRpb25zLnJvdGF0aW9uXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy50aXRsZSkpIHtcbiAgICBvcHRzLnRpdGxlID0gb3B0aW9ucy50aXRsZVxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMuc2hhZG93KSkge1xuICAgIG9wdHMuc2hhZG93ID0gdG9JY29uKG9wdGlvbnMuc2hhZG93LmltYWdlVXJsLCBvcHRpb25zLnNoYWRvdy5zaXplLCBvcHRpb25zLnNoYWRvdylcbiAgfVxuXG4gIHJldHVybiBvcHRzXG59XG5cbmV4cG9ydCBmdW5jdGlvbiB0b05hdmlnYXRpb25Db250cm9sT3B0aW9ucyhvcHRpb25zOiBOYXZpZ2F0aW9uQ29udHJvbE9wdGlvbnMpOiBCTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zIHtcbiAgY29uc3Qgb3B0czogQk5hdmlnYXRpb25Db250cm9sT3B0aW9ucyA9IHt9XG5cbiAgaWYgKCFvcHRpb25zKSB7XG4gICAgcmV0dXJuIG9wdHNcbiAgfVxuXG4gIGlmICghaXNOdWxsKG9wdGlvbnMuYW5jaG9yKSkge1xuICAgIG9wdHMuYW5jaG9yID0gb3B0aW9ucy5hbmNob3JcbiAgfVxuICBpZiAoIWlzTnVsbChvcHRpb25zLmVuYWJsZUdlb2xvY2F0aW9uKSkge1xuICAgIG9wdHMuZW5hYmxlR2VvbG9jYXRpb24gPSBvcHRpb25zLmVuYWJsZUdlb2xvY2F0aW9uXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5vZmZzZXQpKSB7XG4gICAgb3B0cy5vZmZzZXQgPSB0b1NpemUob3B0aW9ucy5vZmZzZXQpXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5zaG93Wm9vbUluZm8pKSB7XG4gICAgb3B0cy5zaG93Wm9vbUluZm8gPSBvcHRpb25zLnNob3dab29tSW5mb1xuICB9XG5cbiAgaWYgKCFpc051bGwob3B0aW9ucy50eXBlKSkge1xuICAgIG9wdHMudHlwZSA9IG9wdGlvbnMudHlwZVxuICB9XG4gIHJldHVybiBvcHRzXG59XG5cbmV4cG9ydCBmdW5jdGlvbiB0b092ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMob3B0aW9uczogT3ZlcnZpZXdNYXBDb250cm9sT3B0aW9ucyk6IEJPdmVydmlld01hcENvbnRyb2xPcHRpb25zIHtcbiAgY29uc3Qgb3B0czogQk92ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMgPSB7fVxuXG4gIGlmICghb3B0aW9ucykge1xuICAgIHJldHVybiBvcHRzXG4gIH1cblxuICBpZiAoIWlzTnVsbChvcHRpb25zLmFuY2hvcikpIHtcbiAgICBvcHRzLmFuY2hvciA9IG9wdGlvbnMuYW5jaG9yXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5pc09wZW4pKSB7XG4gICAgb3B0cy5pc09wZW4gPSBvcHRpb25zLmlzT3BlblxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMub2Zmc2V0KSkge1xuICAgIG9wdHMub2Zmc2V0ID0gdG9TaXplKG9wdGlvbnMub2Zmc2V0KVxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMuc2l6ZSkpIHtcbiAgICBvcHRzLnNpemUgPSB0b1NpemUob3B0aW9ucy5zaXplKVxuICB9XG4gIHJldHVybiBvcHRzXG59XG5cbmV4cG9ydCBmdW5jdGlvbiB0b1NjYWxlQ29udHJvbE9wdGlvbnMob3B0aW9uczogU2NhbGVDb250cm9sT3B0aW9ucyk6IEJTY2FsZUNvbnRyb2xPcHRpb25zIHtcbiAgY29uc3Qgb3B0czogQlNjYWxlQ29udHJvbE9wdGlvbnMgPSB7fVxuXG4gIGlmICghb3B0aW9ucykge1xuICAgIHJldHVybiBvcHRzXG4gIH1cblxuICBpZiAoIWlzTnVsbChvcHRpb25zLmFuY2hvcikpIHtcbiAgICBvcHRzLmFuY2hvciA9IG9wdGlvbnMuYW5jaG9yXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5vZmZzZXQpKSB7XG4gICAgb3B0cy5vZmZzZXQgPSB0b1NpemUob3B0aW9ucy5vZmZzZXQpXG4gIH1cbiAgcmV0dXJuIG9wdHNcbn1cblxuZXhwb3J0IGZ1bmN0aW9uIHRvTWFwVHlwZUNvbnRyb2xPcHRpb25zKG9wdGlvbnM6IE1hcFR5cGVDb250cm9sT3B0aW9ucyk6IEJNYXBUeXBlQ29udHJvbE9wdGlvbnMge1xuICBjb25zdCBvcHRzOiBCTWFwVHlwZUNvbnRyb2xPcHRpb25zID0ge31cblxuICBpZiAoIW9wdGlvbnMpIHtcbiAgICByZXR1cm4gb3B0c1xuICB9XG5cbiAgaWYgKCFpc051bGwob3B0aW9ucy50eXBlKSkge1xuICAgIG9wdHMudHlwZSA9IG9wdGlvbnMudHlwZVxuICB9XG4gIHJldHVybiBvcHRzXG59XG5leHBvcnQgZnVuY3Rpb24gdG9HZW9sb2NhdGlvbk9wdGlvbnMob3B0aW9uczogR2VvbG9jYXRpb25Db250cm9sT3B0aW9ucyk6IEJHZW9sb2NhdGlvbkNvbnRyb2xPcHRpb25zIHtcbiAgY29uc3Qgb3B0czogQkdlb2xvY2F0aW9uQ29udHJvbE9wdGlvbnMgPSB7fVxuXG4gIGlmICghb3B0aW9ucykge1xuICAgIHJldHVybiBvcHRzXG4gIH1cblxuICBpZiAoIWlzTnVsbChvcHRpb25zLmFuY2hvcikpIHtcbiAgICBvcHRzLmFuY2hvciA9IG9wdGlvbnMuYW5jaG9yXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5vZmZzZXQpKSB7XG4gICAgb3B0cy5vZmZzZXQgPSB0b1NpemUob3B0aW9ucy5vZmZzZXQpXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5lbmFibGVBdXRvTG9jYXRpb24pKSB7XG4gICAgb3B0cy5lbmFibGVBdXRvTG9jYXRpb24gPSBvcHRpb25zLmVuYWJsZUF1dG9Mb2NhdGlvblxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMubG9jYXRpb25JY29uKSkge1xuICAgIG9wdHMubG9jYXRpb25JY29uID0gdG9JY29uKG9wdGlvbnMubG9jYXRpb25JY29uLmltYWdlVXJsLCBvcHRpb25zLmxvY2F0aW9uSWNvbi5zaXplLCBvcHRpb25zLmxvY2F0aW9uSWNvbilcbiAgfVxuICBpZiAoIWlzTnVsbChvcHRpb25zLnNob3dBZGRyZXNzQmFyKSkge1xuICAgIG9wdHMuc2hvd0FkZHJlc3NCYXIgPSBvcHRpb25zLnNob3dBZGRyZXNzQmFyXG4gIH1cbiAgcmV0dXJuIG9wdHNcbn1cblxuZXhwb3J0IGZ1bmN0aW9uIHRvVGV4dEljb25TdHlsZShzdHlsZTogVGV4dEljb25TdHlsZSk6IEJUZXh0SWNvblN0eWxlIHtcbiAgY29uc3QgcmVhbFN0eWxlOiBCVGV4dEljb25TdHlsZSA9IHtcbiAgICB1cmw6IHN0eWxlLnVybCxcbiAgICBzaXplOiB0b1NpemUoc3R5bGUuc2l6ZSlcbiAgfVxuICBpZiAoc3R5bGUuYW5jaG9yKSB7XG4gICAgcmVhbFN0eWxlLmFuY2hvciA9IHRvU2l6ZShzdHlsZS5hbmNob3IpXG4gIH1cbiAgaWYgKHN0eWxlLm9mZnNldCkge1xuICAgIHJlYWxTdHlsZS5vZmZzZXQgPSB0b1NpemUoc3R5bGUub2Zmc2V0KVxuICB9XG4gIGlmICghaXNOdWxsKHN0eWxlLnRleHRTaXplKSkge1xuICAgIHJlYWxTdHlsZS50ZXh0U2l6ZSA9IHN0eWxlLnRleHRTaXplXG4gIH1cbiAgaWYgKCFpc051bGwoc3R5bGUudGV4dENvbG9yKSkge1xuICAgIHJlYWxTdHlsZS50ZXh0Q29sb3IgPSBzdHlsZS50ZXh0Q29sb3JcbiAgfVxuXG4gIHJldHVybiByZWFsU3R5bGVcbn1cblxuZXhwb3J0IGZ1bmN0aW9uIHRvTWFya2VyQ2x1c3RlcmVyT3B0aW9ucyhvcHRpb25zOiBNYXJrZXJDbHVzdGVyZXJPcHRpb25zKTogQk1hcmtlckNsdXN0ZXJlck9wdGlvbnMge1xuICBjb25zdCBvcHRzOiBCTWFya2VyQ2x1c3RlcmVyT3B0aW9ucyA9IHt9XG5cbiAgaWYgKCFvcHRpb25zKSB7XG4gICAgcmV0dXJuIG9wdHNcbiAgfVxuXG4gIGlmIChvcHRpb25zLm1hcmtlcnMpIHtcbiAgICBvcHRzLm1hcmtlcnMgPSBvcHRpb25zLm1hcmtlcnMubWFwKFxuICAgICAgbSA9PiBuZXcgd2luZG93LkJNYXAuTWFya2VyKHRvUG9pbnQobS5wb2ludCksIHRvTWFya2VyT3B0aW9ucyhtLm9wdGlvbnMpKVxuICAgIClcbiAgfVxuXG4gIGlmICghaXNOdWxsKG9wdGlvbnMuZ2lyZFNpemUpKSB7XG4gICAgb3B0cy5naXJkU2l6ZSA9IG9wdGlvbnMuZ2lyZFNpemVcbiAgfVxuICBpZiAoIWlzTnVsbChvcHRpb25zLm1heFpvb20pKSB7XG4gICAgb3B0cy5tYXhab29tID0gb3B0aW9ucy5tYXhab29tXG4gIH1cbiAgaWYgKCFpc051bGwob3B0aW9ucy5taW5DbHVzdGVyU2l6ZSkpIHtcbiAgICBvcHRzLm1pbkNsdXN0ZXJTaXplID0gb3B0aW9ucy5taW5DbHVzdGVyU2l6ZVxuICB9XG4gIGlmICghaXNOdWxsKG9wdGlvbnMuaXNBdmVyYW5nZUNlbnRlcikpIHtcbiAgICBvcHRzLmlzQXZlcmFuZ2VDZW50ZXIgPSBvcHRpb25zLmlzQXZlcmFuZ2VDZW50ZXJcbiAgfVxuICBpZiAob3B0aW9ucy5zdHlsZXMpIHtcbiAgICBvcHRzLnN0eWxlcyA9IG9wdGlvbnMuc3R5bGVzLmZpbHRlcihzID0+IHMpLm1hcChzID0+IHRvVGV4dEljb25TdHlsZShzKSlcbiAgfVxuXG4gIHJldHVybiBvcHRzXG59XG4iLCJpbXBvcnQgeyBpc051bGwgfSBmcm9tICcuL29iamVjdCdcblxuZXhwb3J0IGZ1bmN0aW9uIG51bGxDaGVjayhvYmo6IGFueSwgbXNnOiBzdHJpbmcpIHtcbiAgaWYgKGlzTnVsbChvYmopKSB7XG4gICAgdGhyb3cgbmV3IEVycm9yKG1zZylcbiAgfVxufVxuIiwiaW1wb3J0IHsgSW5qZWN0YWJsZSB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5pbXBvcnQgeyBpc1N0cmluZyB9IGZyb20gJy4uL2hlbHBlcnMvb2JqZWN0J1xuaW1wb3J0IHsgU2NyaXB0VHlwZSB9IGZyb20gJy4uL3R5cGVzL1NjcmlwdCdcblxuZXhwb3J0IGVudW0gTE9BRElOR19TVEFURSB7XG4gIE5PTiA9IDAsXG4gIExPQURFRCA9IDEsXG4gIExPQURJTkcgPSAyXG59XG5cbmV4cG9ydCBjbGFzcyBTY3JpcHRMb2FkZXJDb25maWcge1xuICBwdWJsaWMgYWs6IHN0cmluZyA9ICcnXG59XG5cbndpbmRvdy5fc2NyaXB0TG9hZFN0YXRlID0ge31cbndpbmRvdy5fbG9hZGluZ0NhbGxiYWNrcyA9IHt9XG5cbkBJbmplY3RhYmxlKClcbmV4cG9ydCBjbGFzcyBTY3JpcHRMb2FkZXIge1xuICBwdWJsaWMgbG9hZCh1cmw6IHN0cmluZyB8IFNjcmlwdFR5cGUsIGlzTWFpbjogYm9vbGVhbiA9IGZhbHNlLCBjYjogKCkgPT4gdm9pZCk6IHZvaWQge1xuICAgIGNvbnN0IHNjcmlwdEtleSA9IGlzU3RyaW5nKHVybCkgPyB1cmwgOiB1cmxbJ2tleSddXG4gICAgY29uc3Qgc2NyaXB0VXJscyA9IGlzU3RyaW5nKHVybCkgPyBbdXJsXSA6IHVybFsnc2NyaXB0cyddXG5cbiAgICBpZiAod2luZG93Ll9zY3JpcHRMb2FkU3RhdGVbc2NyaXB0S2V5XSA9PT0gTE9BRElOR19TVEFURS5MT0FERUQpIHtcbiAgICAgIGlmIChpc01haW4pIHtcbiAgICAgICAgc3dpdGNoRGlzcGxheSgnYmFpZHUtbWFwIC5iYWlkdS1tYXAtaW5zdGFuY2UnLCAnYmxvY2snKVxuICAgICAgICBzd2l0Y2hEaXNwbGF5KCdiYWlkdS1tYXAgLmJhaWR1LW1hcC1vZmZsaW5lJywgJ25vbmUnKVxuICAgICAgfVxuICAgICAgcmV0dXJuIGNiKClcbiAgICB9XG4gICAgaWYgKCF3aW5kb3cuX2xvYWRpbmdDYWxsYmFja3Nbc2NyaXB0S2V5XSkge1xuICAgICAgd2luZG93Ll9sb2FkaW5nQ2FsbGJhY2tzW3NjcmlwdEtleV0gPSBbXVxuICAgIH1cbiAgICBpZiAod2luZG93Ll9zY3JpcHRMb2FkU3RhdGVbc2NyaXB0S2V5XSA9PT0gTE9BRElOR19TVEFURS5MT0FESU5HKSB7XG4gICAgICB3aW5kb3cuX2xvYWRpbmdDYWxsYmFja3Nbc2NyaXB0S2V5XS5wdXNoKGNiKVxuICAgICAgcmV0dXJuXG4gICAgfVxuICAgIHdpbmRvdy5fc2NyaXB0TG9hZFN0YXRlW3NjcmlwdEtleV0gPSBMT0FESU5HX1NUQVRFLkxPQURJTkdcbiAgICB3aW5kb3cuX2xvYWRpbmdDYWxsYmFja3Nbc2NyaXB0S2V5XS5wdXNoKGNiKVxuXG4gICAgaWYgKGlzTWFpbikge1xuICAgICAgd2luZG93LmJhaWR1bWFwaW5pdCA9ICgpID0+IHtcbiAgICAgICAgd2luZG93Ll9zY3JpcHRMb2FkU3RhdGVbc2NyaXB0S2V5XSA9IExPQURJTkdfU1RBVEUuTE9BREVEXG4gICAgICAgIHN3aXRjaERpc3BsYXkoJ2JhaWR1LW1hcCAuYmFpZHUtbWFwLWluc3RhbmNlJywgJ2Jsb2NrJylcbiAgICAgICAgc3dpdGNoRGlzcGxheSgnYmFpZHUtbWFwIC5iYWlkdS1tYXAtb2ZmbGluZScsICdub25lJylcbiAgICAgICAgd2luZG93Ll9sb2FkaW5nQ2FsbGJhY2tzW3NjcmlwdEtleV0uZm9yRWFjaCgoYzogKCkgPT4gdm9pZCkgPT4ge1xuICAgICAgICAgIGMoKVxuICAgICAgICB9KVxuICAgICAgfVxuICAgIH1cbiAgICBhcHBlbmRTY3JpcHRzVGFnKHNjcmlwdEtleSwgc2NyaXB0VXJscywgaXNNYWluKVxuICB9XG59XG5cbmZ1bmN0aW9uIGFwcGVuZFNjcmlwdHNUYWcoc2NyaXB0S2V5OiBzdHJpbmcsIHVybHM6IEFycmF5PHN0cmluZz4sIGlzTWFpbjogYm9vbGVhbikge1xuICBjb25zdCBsZWZ0T2JqID0ge1xuICAgIGNvdW50OiB1cmxzLmxlbmd0aFxuICB9XG4gIHVybHMuZm9yRWFjaCh1cmwgPT4ge1xuICAgIGFwcGVuZFNjcmlwdFRhZyhzY3JpcHRLZXksIHVybCwgaXNNYWluLCBsZWZ0T2JqKVxuICB9KVxufVxuXG5mdW5jdGlvbiBhcHBlbmRTY3JpcHRUYWcoc2NyaXB0S2V5OiBzdHJpbmcsIHVybDogc3RyaW5nLCBpc01haW46IGJvb2xlYW4sIGxlZnRPYmo6IHsgY291bnQ6IG51bWJlciB9KSB7XG4gIGNvbnN0IHNjcmlwdCA9IGRvY3VtZW50LmNyZWF0ZUVsZW1lbnQoJ3NjcmlwdCcpXG4gIHNjcmlwdC50eXBlID0gJ3RleHQvamF2YXNjcmlwdCdcbiAgc2NyaXB0LnNyYyA9IHVybFxuICBzY3JpcHQub25lcnJvciA9ICgpID0+IHtcbiAgICBpZiAoaXNNYWluKSB7XG4gICAgICBzd2l0Y2hEaXNwbGF5KCdiYWlkdS1tYXAgLmJhaWR1LW1hcC1vZmZsaW5lJywgJ2Jsb2NrJylcbiAgICAgIHN3aXRjaERpc3BsYXkoJ2JhaWR1LW1hcCAuYmFpZHUtbWFwLWluc3RhbmNlJywgJ25vbmUnKVxuICAgIH1cbiAgICBkb2N1bWVudC5ib2R5LnJlbW92ZUNoaWxkKHNjcmlwdClcblxuICAgIHNldFRpbWVvdXQoKCkgPT4ge1xuICAgICAgYXBwZW5kU2NyaXB0VGFnKHNjcmlwdEtleSwgdXJsLCBpc01haW4sIGxlZnRPYmopXG4gICAgfSwgMzAwMDApXG4gIH1cblxuICBpZiAoIWlzTWFpbikge1xuICAgIHNjcmlwdC5vbmxvYWQgPSAoKSA9PiB7XG4gICAgICBsZWZ0T2JqLmNvdW50LS1cbiAgICAgIGlmIChsZWZ0T2JqLmNvdW50KSB7XG4gICAgICAgIHJldHVyblxuICAgICAgfVxuICAgICAgd2luZG93Ll9zY3JpcHRMb2FkU3RhdGVbc2NyaXB0S2V5XSA9IExPQURJTkdfU1RBVEUuTE9BREVEXG4gICAgICB3aW5kb3cuX2xvYWRpbmdDYWxsYmFja3Nbc2NyaXB0S2V5XS5mb3JFYWNoKChjOiAoKSA9PiB2b2lkKSA9PiB7XG4gICAgICAgIGMoKVxuICAgICAgfSlcbiAgICB9XG4gIH1cbiAgZG9jdW1lbnQuYm9keS5hcHBlbmRDaGlsZChzY3JpcHQpXG59XG5cbmZ1bmN0aW9uIHN3aXRjaERpc3BsYXkoc2VsZWN0b3I6IHN0cmluZywgc3RhdGU6IHN0cmluZykge1xuICBBcnJheS5wcm90b3R5cGUuc2xpY2UuY2FsbChkb2N1bWVudC5xdWVyeVNlbGVjdG9yQWxsKHNlbGVjdG9yKSkuZm9yRWFjaCgobm9kZTogSFRNTEVsZW1lbnQpID0+IHtcbiAgICBub2RlLnN0eWxlLmRpc3BsYXkgPSBzdGF0ZVxuICB9KVxufVxuIiwiaW1wb3J0IHsgQkJvdW5kcyB9IGZyb20gJy4vQm91bmRzJ1xuaW1wb3J0IHsgQkNvbnRyb2wgfSBmcm9tICcuL0NvbnRyb2wnXG5pbXBvcnQgeyBPdmVybGF5IH0gZnJvbSAnLi9PdmVybGF5J1xuaW1wb3J0IHsgQlBvaW50LCBQb2ludCB9IGZyb20gJy4vUG9pbnQnXG5pbXBvcnQgeyBCVGlsZUxheWVyIH0gZnJvbSAnLi9UaWxlTGF5ZXInXG5pbXBvcnQgeyBpc0Z1bmN0aW9uIH0gZnJvbSAnLi4vaGVscGVycy9vYmplY3QnXG5pbXBvcnQgeyBCU2l6ZSB9IGZyb20gJy4vU2l6ZSdcbmltcG9ydCB7IEJJbmZvV2luZG93IH0gZnJvbSAnLi9JbmZvV2luZG93J1xuaW1wb3J0IHsgQk1hcFR5cGUgfSBmcm9tICcuL01hcFR5cGUnXG5pbXBvcnQgeyBCUGl4ZWwgfSBmcm9tICcuL1BpeGVsJ1xuXG5leHBvcnQgaW50ZXJmYWNlIEJNYXBDb25zdHJ1Y3RvciB7XG4gIG5ldyAoZWw6IEhUTUxFbGVtZW50IHwgc3RyaW5nLCBvcHRzOiBNYXBPcHRpb25zKTogQk1hcEluc3RhbmNlXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk1hcEluc3RhbmNlIHtcbiAgZGlzYWJsZURyYWdnaW5nKCk6IHZvaWRcbiAgZW5hYmxlRHJhZ2dpbmcoKTogdm9pZFxuXG4gIGRpc2FibGVTY3JvbGxXaGVlbFpvb20oKTogdm9pZFxuICBlbmFibGVTY3JvbGxXaGVlbFpvb20oKTogdm9pZFxuXG4gIGRpc2FibGVEb3VibGVDbGlja1pvb20oKTogdm9pZFxuICBlbmFibGVEb3VibGVDbGlja1pvb20oKTogdm9pZFxuXG4gIGRpc2FibGVLZXlib2FyZCgpOiB2b2lkXG4gIGVuYWJsZUtleWJvYXJkKCk6IHZvaWRcblxuICBkaXNhYmxlSW5lcnRpYWxEcmFnZ2luZygpOiB2b2lkXG4gIGVuYWJsZUluZXJ0aWFsRHJhZ2dpbmcoKTogdm9pZFxuXG4gIGRpc2FibGVDb250aW51b3VzWm9vbSgpOiB2b2lkXG4gIGVuYWJsZUNvbnRpbnVvdXNab29tKCk6IHZvaWRcblxuICBkaXNhYmxlUGluY2hUb1pvb20oKTogdm9pZFxuICBlbmFibGVQaW5jaFRvWm9vbSgpOiB2b2lkXG5cbiAgZGlzYWJsZUF1dG9SZXNpemUoKTogdm9pZFxuICBlbmFibGVBdXRvUmVzaXplKCk6IHZvaWRcblxuICBhZGRDb250cm9sKGNvbnRyb2w6IEJDb250cm9sKTogdm9pZFxuICByZW1vdmVDb250cm9sKGNvbnRyb2w6IEJDb250cm9sKTogdm9pZFxuXG4gIGFkZE92ZXJsYXkoY29udHJvbDogT3ZlcmxheSk6IHZvaWRcbiAgcmVtb3ZlT3ZlcmxheShjb250cm9sOiBPdmVybGF5KTogdm9pZFxuICBjbGVhck92ZXJsYXlzKCk6IHZvaWRcblxuICBhZGRUaWxlTGF5ZXIodGlsZUxheWVyOiBCVGlsZUxheWVyKTogdm9pZFxuICByZW1vdmVUaWxlTGF5ZXIodGlsZUxheWVyOiBCVGlsZUxheWVyKTogdm9pZFxuXG4gIHNldERlZmF1bHRDdXJzb3IoY3Vyc29yOiBzdHJpbmcpOiB2b2lkXG4gIGdldERlZmF1bHRDdXJzb3IoKTogc3RyaW5nXG5cbiAgc2V0RHJhZ2dpbmdDdXJzb3IoZHJhZ2dpbmdDdXJzb3I6IHN0cmluZyk6IHZvaWRcbiAgZ2V0RHJhZ2dpbmdDdXJzb3IoKTogc3RyaW5nXG5cbiAgc2V0TWluWm9vbSh6b29tOiBudW1iZXIpOiB2b2lkXG4gIHNldE1heFpvb20oem9vbTogbnVtYmVyKTogdm9pZFxuXG4gIGdldEJvdW5kcygpOiBCQm91bmRzXG5cbiAgc2V0Q2VudGVyKGNlbnRlcjogQlBvaW50IHwgc3RyaW5nKTogdm9pZFxuICBnZXRDZW50ZXIoKTogQlBvaW50XG5cbiAgZ2V0RGlzdGFuY2Uoc3RhcnQ6IEJQb2ludCwgZW5kOiBCUG9pbnQpOiBudW1iZXJcblxuICBzZXRDdXJyZW50Q2l0eShjaXR5OiBzdHJpbmcpOiB2b2lkXG4gIGNlbnRlckFuZFpvb20oY2VudGVyOiBCUG9pbnQsIHpvb206IG51bWJlcik6IHZvaWRcblxuICBzZXRNYXBUeXBlKG1hcFR5cGU6IEJNYXBUeXBlIHwgTWFwVHlwZUVudW0pOiB2b2lkXG4gIGdldE1hcFR5cGUoKTogQk1hcFR5cGVcblxuICBnZXRTaXplKCk6IEJTaXplXG5cbiAgc2V0Wm9vbSh6b29tOiBudW1iZXIpOiB2b2lkXG4gIGdldFpvb20oKTogbnVtYmVyXG5cbiAgcGFuVG8oY2VudGVyOiBCUG9pbnQsIG9wdHM6IEJQYW5PcHRpb25zKTogdm9pZFxuXG4gIHBhbkJ5KHg6IG51bWJlciwgeTogbnVtYmVyLCBvcHRzOiBCUGFuT3B0aW9ucyk6IHZvaWRcblxuICByZXNldCgpOiB2b2lkXG5cbiAgaGlnaFJlc29sdXRpb25FbmFibGVkKCk6IGJvb2xlYW5cblxuICB6b29tSW4oKTogdm9pZFxuICB6b29tT3V0KCk6IHZvaWRcblxuICBnZXRDb250YWluZXIoKTogSFRNTEVsZW1lbnRcblxuICBjbG9zZUluZm9XaW5kb3coKTogdm9pZFxuXG4gIHBpeGVsVG9Qb2ludChwaXhlbDogQlBpeGVsKTogQlBvaW50XG5cbiAgcG9pbnRUb1BpeGVsKHBvaW50OiBCUG9pbnQpOiBCUGl4ZWxcblxuICBvcGVuSW5mb1dpbmRvdyhpbmZvV25kOiBCSW5mb1dpbmRvdywgcG9pbnQ6IEJQb2ludCk6IHZvaWRcblxuICBhZGRFdmVudExpc3RlbmVyKGV2ZW50OiBzdHJpbmcsIGhhbmRsZXI6IChlOiBhbnkpID0+IHZvaWQpOiB2b2lkXG4gIHJlbW92ZUV2ZW50TGlzdGVuZXIoZXZlbnQ6IHN0cmluZywgaGFuZGxlcjogKCkgPT4gdm9pZCk6IHZvaWRcbn1cblxuZXhwb3J0IGludGVyZmFjZSBNYXBPcHRpb25zIHtcbiAgbWluWm9vbT86IG51bWJlclxuICBtYXhab29tPzogbnVtYmVyXG4gIGVuYWJsZUhpZ2hSZXNvbHV0aW9uPzogYm9vbGVhblxuICBlbmFibGVBdXRvUmVzaXplPzogYm9vbGVhblxuICBlbmFibGVNYXBDbGljaz86IGJvb2xlYW5cblxuICBkaXNhYmxlRHJhZ2dpbmc/OiBib29sZWFuXG4gIGVuYWJsZVNjcm9sbFdoZWVsWm9vbT86IGJvb2xlYW5cbiAgZGlzYWJsZURvdWJsZUNsaWNrWm9vbT86IGJvb2xlYW5cbiAgZW5hYmxlS2V5Ym9hcmQ/OiBib29sZWFuXG4gIGVuYWJsZUluZXJ0aWFsRHJhZ2dpbmc/OiBib29sZWFuXG4gIGVuYWJsZUNvbnRpbnVvdXNab29tPzogYm9vbGVhblxuICBkaXNhYmxlUGluY2hUb1pvb20/OiBib29sZWFuXG5cbiAgY3Vyc29yPzogc3RyaW5nXG4gIGRyYWdnaW5nQ3Vyc29yPzogc3RyaW5nXG4gIGN1cnJlbnRDaXR5Pzogc3RyaW5nXG4gIGNlbnRlckFuZFpvb20/OiBDZW50ZXJBbmRab29tXG5cbiAgbWFwVHlwZT86IEJNYXBUeXBlIHwgTWFwVHlwZUVudW1cbn1cblxuZXhwb3J0IGludGVyZmFjZSBDZW50ZXJBbmRab29tIGV4dGVuZHMgUG9pbnQge1xuICB6b29tPzogbnVtYmVyXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQlBhbk9wdGlvbnMge1xuICBub0FuaW1hdGlvbjogYm9vbGVhblxufVxuXG5leHBvcnQgZW51bSBNYXBUeXBlRW51bSB7XG4gIEJNQVBfTk9STUFMX01BUCA9ICdCTUFQX05PUk1BTF9NQVAnLFxuICBCTUFQX1BFUlNQRUNUSVZFX01BUCA9ICdCTUFQX1BFUlNQRUNUSVZFX01BUCcsXG4gIEJNQVBfU0FURUxMSVRFX01BUCA9ICdCTUFQX1NBVEVMTElURV9NQVAnLFxuICBCTUFQX0hZQlJJRF9NQVAgPSAnQk1BUF9IWUJSSURfTUFQJ1xufVxuXG5leHBvcnQgZnVuY3Rpb24gaXNNYXBUeXBlRW51bShtYXB0eXBlOiBNYXBUeXBlRW51bSB8IEJNYXBUeXBlKTogbWFwdHlwZSBpcyBNYXBUeXBlRW51bSB7XG4gIHJldHVybiAhaXNGdW5jdGlvbigoPEJNYXBUeXBlPm1hcHR5cGUpLmdldFRpbGVMYXllcilcbn1cbiIsImltcG9ydCB7IEluamVjdGFibGUsIEluamVjdCB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5pbXBvcnQgeyBpc0Jvb2xlYW4sIGlzTnVsbCwgb21pdCB9IGZyb20gJy4uL2hlbHBlcnMvb2JqZWN0J1xuaW1wb3J0IHsgbnVsbENoZWNrIH0gZnJvbSAnLi4vaGVscGVycy92YWxpZGF0ZSdcbmltcG9ydCB7IEJDb250cm9sIH0gZnJvbSAnLi4vdHlwZXMvQ29udHJvbCdcbmltcG9ydCB7IFNjcmlwdExvYWRlckNvbmZpZyB9IGZyb20gJy4vc2NyaXB0TG9hZGVyJ1xuaW1wb3J0IHsgQk1hcEluc3RhbmNlLCBNYXBPcHRpb25zLCBpc01hcFR5cGVFbnVtIH0gZnJvbSAnLi4vdHlwZXMvTWFwJ1xuaW1wb3J0IHsgT3ZlcmxheSB9IGZyb20gJy4uL3R5cGVzL092ZXJsYXknXG5pbXBvcnQgeyBCVGlsZUxheWVyIH0gZnJvbSAnLi4vdHlwZXMvVGlsZUxheWVyJ1xuXG5pbXBvcnQgeyB0b1BvaW50IH0gZnJvbSAnLi4vaGVscGVycy90cmFuc2Zvcm1lcidcblxuaW1wb3J0IHsgU2NyaXB0TG9hZGVyIH0gZnJvbSAnLi9zY3JpcHRMb2FkZXInXG5cbkBJbmplY3RhYmxlKClcbmV4cG9ydCBjbGFzcyBNYXBTZXJ2aWNlIHtcbiAgcHJpdmF0ZSBfY29uZmlnOiBTY3JpcHRMb2FkZXJDb25maWdcblxuICBwcml2YXRlIF9tYXA6IFByb21pc2U8Qk1hcEluc3RhbmNlPlxuICBwcml2YXRlIF9tYXBSZXNvbHZlcjogKHZhbHVlOiBCTWFwSW5zdGFuY2UpID0+IHZvaWRcblxuICBjb25zdHJ1Y3RvcihASW5qZWN0KFNjcmlwdExvYWRlckNvbmZpZykgY29uZmlnOiBTY3JpcHRMb2FkZXJDb25maWcsIHByaXZhdGUgX2xvYWRlcjogU2NyaXB0TG9hZGVyKSB7XG4gICAgbnVsbENoZWNrKGNvbmZpZy5haywgJ2FrIG11c3QgYmUgcHJvdmlkZWQnKVxuXG4gICAgdGhpcy5fY29uZmlnID0gY29uZmlnXG5cbiAgICB0aGlzLl9tYXAgPSBuZXcgUHJvbWlzZTxCTWFwSW5zdGFuY2U+KChyZXNvbHZlOiAoKSA9PiB2b2lkKSA9PiB7XG4gICAgICB0aGlzLl9tYXBSZXNvbHZlciA9IHJlc29sdmVcbiAgICB9KVxuICB9XG5cbiAgcHVibGljIGNyZWF0ZU1hcChlbDogSFRNTEVsZW1lbnQsIG1hcE9wdGlvbnM6IE1hcE9wdGlvbnMpOiBQcm9taXNlPEJNYXBJbnN0YW5jZT4ge1xuICAgIGNvbnN0IFVSTCA9IGBodHRwczovL2FwaS5tYXAuYmFpZHUuY29tL2FwaT92PTMuMCZhaz0ke3RoaXMuX2NvbmZpZy5ha30mY2FsbGJhY2s9YmFpZHVtYXBpbml0YFxuXG4gICAgcmV0dXJuIG5ldyBQcm9taXNlKHJlc29sdmUgPT4ge1xuICAgICAgdGhpcy5fbG9hZGVyLmxvYWQoVVJMLCB0cnVlLCAoKSA9PiB7XG4gICAgICAgIGNvbnN0IG1hcCA9IG5ldyB3aW5kb3cuQk1hcC5NYXAoZWwsIG9taXQobWFwT3B0aW9ucywgJ21hcFR5cGUnKSlcbiAgICAgICAgdGhpcy5zZXRPcHRpb25zKG1hcE9wdGlvbnMpXG4gICAgICAgIHRoaXMuX21hcFJlc29sdmVyKG1hcClcbiAgICAgICAgcmVzb2x2ZShtYXApXG4gICAgICB9KVxuICAgIH0pXG4gIH1cblxuICBwdWJsaWMgc2V0T3B0aW9ucyhvcHRzOiBNYXBPcHRpb25zKTogdm9pZCB7XG4gICAgY29uc3Qge1xuICAgICAgZGlzYWJsZURyYWdnaW5nLFxuICAgICAgZW5hYmxlU2Nyb2xsV2hlZWxab29tLFxuICAgICAgZGlzYWJsZURvdWJsZUNsaWNrWm9vbSxcbiAgICAgIGVuYWJsZUtleWJvYXJkLFxuICAgICAgZW5hYmxlSW5lcnRpYWxEcmFnZ2luZyxcbiAgICAgIGVuYWJsZUF1dG9SZXNpemUsXG4gICAgICBlbmFibGVDb250aW51b3VzWm9vbSxcbiAgICAgIGRpc2FibGVQaW5jaFRvWm9vbVxuICAgIH0gPSBvcHRzXG5cbiAgICBpZiAoaXNCb29sZWFuKGRpc2FibGVEcmFnZ2luZykpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXBbKGRpc2FibGVEcmFnZ2luZyA/ICdkaXNhYmxlJyA6ICdlbmFibGUnKSArICdEcmFnZ2luZyddKCkpXG4gICAgfVxuICAgIGlmIChpc0Jvb2xlYW4oZW5hYmxlU2Nyb2xsV2hlZWxab29tKSkge1xuICAgICAgdGhpcy5fbWFwLnRoZW4obWFwID0+IG1hcFsoZW5hYmxlU2Nyb2xsV2hlZWxab29tID8gJ2VuYWJsZScgOiAnZGlzYWJsZScpICsgJ1Njcm9sbFdoZWVsWm9vbSddKCkpXG4gICAgfVxuICAgIGlmIChpc0Jvb2xlYW4oZW5hYmxlQXV0b1Jlc2l6ZSkpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXBbKGVuYWJsZUF1dG9SZXNpemUgPyAnZW5hYmxlJyA6ICdkaXNhYmxlJykgKyAnQXV0b1Jlc2l6ZSddKCkpXG4gICAgfVxuICAgIGlmIChpc0Jvb2xlYW4oZGlzYWJsZURvdWJsZUNsaWNrWm9vbSkpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXBbKGRpc2FibGVEb3VibGVDbGlja1pvb20gPyAnZGlzYWJsZScgOiAnZW5hYmxlJykgKyAnRG91YmxlQ2xpY2tab29tJ10oKSlcbiAgICB9XG4gICAgaWYgKGlzQm9vbGVhbihlbmFibGVLZXlib2FyZCkpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXBbKGVuYWJsZUtleWJvYXJkID8gJ2VuYWJsZScgOiAnZGlzYWJsZScpICsgJ0tleWJvYXJkJ10oKSlcbiAgICB9XG4gICAgaWYgKGlzQm9vbGVhbihlbmFibGVJbmVydGlhbERyYWdnaW5nKSkge1xuICAgICAgdGhpcy5fbWFwLnRoZW4obWFwID0+IG1hcFsoZW5hYmxlSW5lcnRpYWxEcmFnZ2luZyA/ICdlbmFibGUnIDogJ2Rpc2FibGUnKSArICdJbmVydGlhbERyYWdnaW5nJ10oKSlcbiAgICB9XG4gICAgaWYgKGlzQm9vbGVhbihlbmFibGVDb250aW51b3VzWm9vbSkpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXBbKGVuYWJsZUNvbnRpbnVvdXNab29tID8gJ2VuYWJsZScgOiAnZGlzYWJsZScpICsgJ0NvbnRpbnVvdXNab29tJ10oKSlcbiAgICB9XG4gICAgaWYgKGlzQm9vbGVhbihkaXNhYmxlUGluY2hUb1pvb20pKSB7XG4gICAgICB0aGlzLl9tYXAudGhlbihtYXAgPT4gbWFwWyhkaXNhYmxlUGluY2hUb1pvb20gPyAnZGlzYWJsZScgOiAnZW5hYmxlJykgKyAnUGluY2hUb1pvb20nXSgpKVxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRzLmN1cnNvcikpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiBtYXAuc2V0RGVmYXVsdEN1cnNvcihvcHRzLmN1cnNvcikpXG4gICAgfVxuICAgIGlmICghaXNOdWxsKG9wdHMuZHJhZ2dpbmdDdXJzb3IpKSB7XG4gICAgICB0aGlzLl9tYXAudGhlbihtYXAgPT4gbWFwLnNldERyYWdnaW5nQ3Vyc29yKG9wdHMuZHJhZ2dpbmdDdXJzb3IpKVxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRzLmN1cnJlbnRDaXR5KSkge1xuICAgICAgdGhpcy5fbWFwLnRoZW4obWFwID0+IG1hcC5zZXRDdXJyZW50Q2l0eShvcHRzLmN1cnJlbnRDaXR5KSlcbiAgICB9XG4gICAgaWYgKCFpc051bGwob3B0cy5jZW50ZXJBbmRab29tKSkge1xuICAgICAgdGhpcy5fbWFwLnRoZW4obWFwID0+IHtcbiAgICAgICAgbWFwLmNlbnRlckFuZFpvb20odG9Qb2ludChvcHRzLmNlbnRlckFuZFpvb20pLCBvcHRzLmNlbnRlckFuZFpvb20uem9vbSlcbiAgICAgIH0pXG4gICAgfVxuICAgIGlmICghaXNOdWxsKG9wdHMubWFwVHlwZSkpIHtcbiAgICAgIHRoaXMuX21hcC50aGVuKG1hcCA9PiB7XG4gICAgICAgIGNvbnN0IHJlYWxUeXBlID0gaXNNYXBUeXBlRW51bShvcHRzLm1hcFR5cGUpID8gd2luZG93W29wdHMubWFwVHlwZV0gOiBvcHRzLm1hcFR5cGVcbiAgICAgICAgbWFwLnNldE1hcFR5cGUocmVhbFR5cGUpXG4gICAgICB9KVxuICAgIH1cbiAgfVxuXG4gIHB1YmxpYyBhZGRPdmVybGF5KGNiOiAobWFwOiBCTWFwSW5zdGFuY2UpID0+IE92ZXJsYXkpOiBQcm9taXNlPHsgbWFwOiBCTWFwSW5zdGFuY2U7IG92ZXJsYXk6IE92ZXJsYXkgfT4ge1xuICAgIHJldHVybiB0aGlzLl9tYXAudGhlbigobWFwOiBCTWFwSW5zdGFuY2UpID0+IHtcbiAgICAgIGNvbnN0IG92ZXJsYXkgPSBjYihtYXApXG4gICAgICBtYXAuYWRkT3ZlcmxheShvdmVybGF5KVxuICAgICAgcmV0dXJuIHsgbWFwLCBvdmVybGF5IH1cbiAgICB9KVxuICB9XG5cbiAgcHVibGljIHJlbW92ZU92ZXJsYXkob3ZlcmxheTogT3ZlcmxheSk6IFByb21pc2U8dm9pZD4ge1xuICAgIHJldHVybiB0aGlzLl9tYXAudGhlbigobWFwOiBCTWFwSW5zdGFuY2UpID0+IHtcbiAgICAgIG1hcC5yZW1vdmVPdmVybGF5KG92ZXJsYXkpXG4gICAgfSlcbiAgfVxuXG4gIHB1YmxpYyBhZGRUaWxlTGF5ZXIoXG4gICAgY2I6IChtYXA6IEJNYXBJbnN0YW5jZSkgPT4gQlRpbGVMYXllclxuICApOiBQcm9taXNlPHsgbWFwOiBCTWFwSW5zdGFuY2U7IHRpbGVsYXllcjogQlRpbGVMYXllciB9PiB7XG4gICAgcmV0dXJuIHRoaXMuX21hcC50aGVuKChtYXA6IEJNYXBJbnN0YW5jZSkgPT4ge1xuICAgICAgY29uc3QgdGlsZWxheWVyID0gY2IobWFwKVxuICAgICAgbWFwLmFkZFRpbGVMYXllcih0aWxlbGF5ZXIpXG4gICAgICByZXR1cm4geyBtYXAsIHRpbGVsYXllciB9XG4gICAgfSlcbiAgfVxuXG4gIHB1YmxpYyByZW1vdmVUaWxlTGF5ZXIodGlsZWxheWVyOiBCVGlsZUxheWVyKTogUHJvbWlzZTx2b2lkPiB7XG4gICAgcmV0dXJuIHRoaXMuX21hcC50aGVuKChtYXA6IEJNYXBJbnN0YW5jZSkgPT4ge1xuICAgICAgbWFwLnJlbW92ZU92ZXJsYXkodGlsZWxheWVyKVxuICAgIH0pXG4gIH1cblxuICBwdWJsaWMgYWRkQ29udHJvbChjYjogKG1hcDogQk1hcEluc3RhbmNlKSA9PiBCQ29udHJvbCk6IFByb21pc2U8eyBtYXA6IEJNYXBJbnN0YW5jZTsgY29udHJvbDogQkNvbnRyb2wgfT4ge1xuICAgIHJldHVybiB0aGlzLl9tYXAudGhlbigobWFwOiBCTWFwSW5zdGFuY2UpID0+IHtcbiAgICAgIGNvbnN0IGNvbnRyb2wgPSBjYihtYXApXG4gICAgICBtYXAuYWRkQ29udHJvbChjb250cm9sKVxuICAgICAgcmV0dXJuIHsgbWFwLCBjb250cm9sIH1cbiAgICB9KVxuICB9XG5cbiAgcHVibGljIHJlbW92ZUNvbnRyb2woY29udHJvbDogQkNvbnRyb2wpOiBQcm9taXNlPHZvaWQ+IHtcbiAgICByZXR1cm4gdGhpcy5fbWFwLnRoZW4oKG1hcDogQk1hcEluc3RhbmNlKSA9PiB7XG4gICAgICBtYXAucmVtb3ZlQ29udHJvbChjb250cm9sKVxuICAgIH0pXG4gIH1cblxuICBwdWJsaWMgZ2V0TmF0aXZlTWFwKCk6IFByb21pc2U8Qk1hcEluc3RhbmNlPiB7XG4gICAgcmV0dXJuIHRoaXMuX21hcFxuICB9XG59XG4iLCJpbXBvcnQgeyBEaXJlY3RpdmUsIEV2ZW50RW1pdHRlciwgSW5wdXQsIE91dHB1dCwgT25EZXN0cm95LCBPbkluaXQgfSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQge1xuICB0b0dlb2xvY2F0aW9uT3B0aW9ucyxcbiAgdG9NYXBUeXBlQ29udHJvbE9wdGlvbnMsXG4gIHRvTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zLFxuICB0b092ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMsXG4gIHRvU2NhbGVDb250cm9sT3B0aW9uc1xufSBmcm9tICcuLi9oZWxwZXJzL3RyYW5zZm9ybWVyJ1xuaW1wb3J0IHsgbnVsbENoZWNrIH0gZnJvbSAnLi4vaGVscGVycy92YWxpZGF0ZSdcbmltcG9ydCB7IE1hcFNlcnZpY2UgfSBmcm9tICcuLi9wcm92aWRlcnMvbWFwU2VydmljZSdcbmltcG9ydCB7IEJDb250cm9sLCBDb250cm9sVHlwZSB9IGZyb20gJy4uL3R5cGVzL0NvbnRyb2wnXG5cbkBEaXJlY3RpdmUoe1xuICBzZWxlY3RvcjogJ2NvbnRyb2wnXG59KVxuZXhwb3J0IGNsYXNzIENvbnRyb2xDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpIHByaXZhdGUgdHlwZTogQ29udHJvbFR5cGVcbiAgQElucHV0KCkgcHJpdmF0ZSBvcHRpb25zOiB7IFtrZXk6IHN0cmluZ106IGFueSB9XG5cbiAgQE91dHB1dCgpIHByaXZhdGUgbG9hZGVkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSBjb250cm9sOiBCQ29udHJvbFxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIG51bGxDaGVjayh0aGlzLnR5cGUsICd0eXBlIGlzIHJlcXVpcmVkIGZvciA8Y29udHJvbD4nKVxuXG4gICAgdGhpcy5fc2VydmljZVxuICAgICAgLmFkZENvbnRyb2woKCkgPT4ge1xuICAgICAgICB0aGlzLmNvbnRyb2wgPSB0aGlzLmNyZWF0ZUNvbnRyb2wodGhpcy50eXBlLCB0aGlzLm9wdGlvbnMpXG4gICAgICAgIHJldHVybiB0aGlzLmNvbnRyb2xcbiAgICAgIH0pXG4gICAgICAudGhlbigoeyBjb250cm9sIH0pID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdChjb250cm9sKVxuICAgICAgfSlcbiAgfVxuXG4gIHB1YmxpYyBuZ09uRGVzdHJveSgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlLnJlbW92ZUNvbnRyb2wodGhpcy5jb250cm9sKVxuICB9XG5cbiAgcHJpdmF0ZSBjcmVhdGVDb250cm9sKHR5cGU6IENvbnRyb2xUeXBlLCBvcHRpb25zOiB7IFtrZXk6IHN0cmluZ106IGFueSB9KTogQkNvbnRyb2wge1xuICAgIGlmICh0eXBlID09PSAnbmF2aWdhdGlvbicpIHtcbiAgICAgIHJldHVybiBuZXcgd2luZG93LkJNYXAuTmF2aWdhdGlvbkNvbnRyb2wodG9OYXZpZ2F0aW9uQ29udHJvbE9wdGlvbnMob3B0aW9ucykpXG4gICAgfVxuICAgIGlmICh0eXBlID09PSAnb3ZlcnZpZXdtYXAnKSB7XG4gICAgICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLk92ZXJ2aWV3TWFwQ29udHJvbCh0b092ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMob3B0aW9ucykpXG4gICAgfVxuICAgIGlmICh0eXBlID09PSAnc2NhbGUnKSB7XG4gICAgICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLlNjYWxlQ29udHJvbCh0b1NjYWxlQ29udHJvbE9wdGlvbnMob3B0aW9ucykpXG4gICAgfVxuICAgIGlmICh0eXBlID09PSAnbWFwdHlwZScpIHtcbiAgICAgIHJldHVybiBuZXcgd2luZG93LkJNYXAuTWFwVHlwZUNvbnRyb2wodG9NYXBUeXBlQ29udHJvbE9wdGlvbnMob3B0aW9ucykpXG4gICAgfVxuICAgIGlmICh0eXBlID09PSAnZ2VvbG9jYXRpb24nKSB7XG4gICAgICByZXR1cm4gbmV3IHdpbmRvdy5CTWFwLkdlb2xvY2F0aW9uQ29udHJvbCh0b0dlb2xvY2F0aW9uT3B0aW9ucyhvcHRpb25zKSlcbiAgICB9XG4gICAgaWYgKHR5cGUgPT09ICdwYW5vcmFtYScpIHtcbiAgICAgIHJldHVybiBuZXcgd2luZG93LkJNYXAuUGFub3JhbWFDb250cm9sKClcbiAgICB9XG4gICAgdGhyb3cgbmV3IEVycm9yKGBVbnN1cHBvcnRlZCB0eXBlOiR7dHlwZX0gb2YgY29udHJvbGApXG4gIH1cbn1cbiIsImltcG9ydCB7XG4gIENvbXBvbmVudCxcbiAgRWxlbWVudFJlZixcbiAgRXZlbnRFbWl0dGVyLFxuICBJbnB1dCxcbiAgT25DaGFuZ2VzLFxuICBPbkluaXQsXG4gIE91dHB1dCxcbiAgU2ltcGxlQ2hhbmdlLFxuICBWaWV3Q2hpbGRcbn0gZnJvbSAnQGFuZ3VsYXIvY29yZSdcblxuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgQk1hcEluc3RhbmNlLCBNYXBPcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvTWFwJ1xuXG5pbXBvcnQgeyBudWxsQ2hlY2sgfSBmcm9tICcuLi9oZWxwZXJzL3ZhbGlkYXRlJ1xuXG5AQ29tcG9uZW50KHtcbiAgcHJvdmlkZXJzOiBbTWFwU2VydmljZV0sXG4gIHNlbGVjdG9yOiAnYmFpZHUtbWFwJyxcbiAgc3R5bGVzOiBbXG4gICAgYFxuICAgICAgICAuYmFpZHUtbWFwLWluc3RhbmNlIHtcbiAgICAgICAgICAgIHdpZHRoOiAxMDAlO1xuICAgICAgICAgICAgaGVpZ2h0OiAxMDAlO1xuICAgICAgICAgICAgZGlzcGxheTogbm9uZTtcbiAgICAgICAgfVxuICAgICAgICAuYmFpZHUtbWFwLW9mZmxpbmUge1xuICAgICAgICAgICAgd2lkdGg6IDEwMCU7XG4gICAgICAgICAgICBoZWlnaHQ6IDEwMCU7XG4gICAgICAgICAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjRTZFNkU2O1xuICAgICAgICAgICAgcG9zaXRpb246IHJlbGF0aXZlO1xuICAgICAgICAgICAgZGlzcGxheTogbm9uZTtcbiAgICAgICAgfVxuICAgICAgICAuYmFpZHUtbWFwLW9mZmxpbmUgbGFiZWwge1xuICAgICAgICAgICAgZm9udFNpemU6IDMwcHg7XG4gICAgICAgICAgICBtYXJnaW46IDA7XG4gICAgICAgICAgICBwb3NpdGlvbjogYWJzb2x1dGU7XG4gICAgICAgICAgICB0b3A6IDUwJTtcbiAgICAgICAgICAgIGxlZnQ6IDUwJTtcbiAgICAgICAgICAgIG1hcmdpbi1yaWdodDogLTUwJTtcbiAgICAgICAgICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlKC01MCUsIC01MCUpO1xuICAgICAgICB9XG4gICAgICAgIC50cmFuY2x1ZGUtY29udGVudCB7XG4gICAgICAgICAgICBkaXNwbGF5OiBub25lO1xuICAgICAgICB9XG4gICAgICAgIGBcbiAgXSxcbiAgdGVtcGxhdGU6IGBcbiAgICA8ZGl2ICNtYXBpbnN0YW5jZSBjbGFzcz1cImJhaWR1LW1hcC1pbnN0YW5jZVwiPjwvZGl2PlxuICAgIDxkaXYgY2xhc3M9XCJiYWlkdS1tYXAtb2ZmbGluZVwiPlxuICAgICAgICA8bGFiZWw+e3sgJ05PX05FVFdPUksnIH19PC9sYWJlbD5cbiAgICA8L2Rpdj5cbiAgICA8ZGl2IGNsYXNzPVwidHJhbmNsdWRlLWNvbnRlbnRcIj5cbiAgICAgICAgPG5nLWNvbnRlbnQ+PC9uZy1jb250ZW50PlxuICAgIDwvZGl2PlxuICAgIGBcbn0pXG5leHBvcnQgY2xhc3MgTWFwQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0LCBPbkNoYW5nZXMge1xuICBASW5wdXQoKSBwcml2YXRlIG9wdGlvbnM6IE1hcE9wdGlvbnNcblxuICBAT3V0cHV0KCkgcHJpdmF0ZSBsb2FkZWQgPSBuZXcgRXZlbnRFbWl0dGVyKClcbiAgQE91dHB1dCgpIHByaXZhdGUgY2xpY2tlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIEBWaWV3Q2hpbGQoJ21hcGluc3RhbmNlJykgcHJpdmF0ZSBtYXBJbnN0YW5jZTogRWxlbWVudFJlZlxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIG51bGxDaGVjayh0aGlzLm9wdGlvbnMsICdvcHRpb25zIGlzIHJlcXVpcmVkIGZvciA8YmFpZHUtbWFwPicpXG4gICAgbnVsbENoZWNrKHRoaXMub3B0aW9ucy5jZW50ZXJBbmRab29tLCAnb3B0aW9ucy5jZW50ZXJBbmRab29tIGlzIHJlcXVpcmVkIGZvciA8YmFpZHUtbWFwPicpXG5cbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuY3JlYXRlTWFwKHRoaXMubWFwSW5zdGFuY2UubmF0aXZlRWxlbWVudCwgdGhpcy5vcHRpb25zKVxuICAgICAgLnRoZW4obWFwID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdChtYXApXG4gICAgICAgIHJldHVybiBtYXBcbiAgICAgIH0pXG4gICAgICAudGhlbihtYXAgPT4ge1xuICAgICAgICB0aGlzLmFkZExpc3RlbmVyKG1hcClcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkNoYW5nZXMoY2hhbmdlczogeyBbcHJvcGVydHlOYW1lOiBzdHJpbmddOiBTaW1wbGVDaGFuZ2UgfSkge1xuICAgIGNvbnN0IG9wdHMgPSBjaGFuZ2VzLm9wdGlvbnMuY3VycmVudFZhbHVlIGFzIE1hcE9wdGlvbnNcbiAgICBpZiAoIW9wdHMpIHtcbiAgICAgIHJldHVybiBjb25zb2xlLndhcm4oJ01hcE9wdGlvbnMgY2hhbmdlIHdhcyBpZ25vcmVkIHNpbmNlIHlvdSBhcmUgcGFzc2luZyBlbXB0eSB2YWx1ZScpXG4gICAgfVxuICAgIHRoaXMuX3NlcnZpY2Uuc2V0T3B0aW9ucyhvcHRzKVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIGNvbnNvbGUubG9nKCdvbiBtYXAgZGVzdHJveScpXG4gIH1cblxuICBwcml2YXRlIGFkZExpc3RlbmVyKG1hcDogQk1hcEluc3RhbmNlKSB7XG4gICAgbWFwLmFkZEV2ZW50TGlzdGVuZXIoJ2NsaWNrJywgKGU6IGFueSkgPT4ge1xuICAgICAgdGhpcy5jbGlja2VkLmVtaXQoZSlcbiAgICB9KVxuICB9XG59XG4iLCJpbXBvcnQge1xuICBEaXJlY3RpdmUsXG4gIEV2ZW50RW1pdHRlcixcbiAgSW5wdXQsXG4gIE9uQ2hhbmdlcyxcbiAgT25EZXN0cm95LFxuICBPbkluaXQsXG4gIE91dHB1dCxcbiAgU2ltcGxlQ2hhbmdlXG59IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5cbmltcG9ydCB7IGlzTnVsbCB9IGZyb20gJy4uL2hlbHBlcnMvb2JqZWN0J1xuaW1wb3J0IHsgdG9JY29uLCB0b01hcmtlck9wdGlvbnMsIHRvUG9pbnQsIHRvU2l6ZSB9IGZyb20gJy4uL2hlbHBlcnMvdHJhbnNmb3JtZXInXG5pbXBvcnQgeyBudWxsQ2hlY2sgfSBmcm9tICcuLi9oZWxwZXJzL3ZhbGlkYXRlJ1xuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgQk1hcEluc3RhbmNlIH0gZnJvbSAnLi4vdHlwZXMvTWFwJ1xuaW1wb3J0IHsgQk1hcmtlciwgTWFya2VyT3B0aW9ucyB9IGZyb20gJy4uL3R5cGVzL01hcmtlcidcbmltcG9ydCB7IFBvaW50IH0gZnJvbSAnLi4vdHlwZXMvUG9pbnQnXG5cbkBEaXJlY3RpdmUoe1xuICBzZWxlY3RvcjogJ21hcmtlcidcbn0pXG5leHBvcnQgY2xhc3MgTWFya2VyQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0LCBPbkNoYW5nZXMsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpIHByaXZhdGUgcG9pbnQ6IFBvaW50XG4gIEBJbnB1dCgpIHByaXZhdGUgb3B0aW9uczogTWFya2VyT3B0aW9uc1xuXG4gIEBPdXRwdXQoKSBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuICBAT3V0cHV0KCkgcHJpdmF0ZSBjbGlja2VkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSBtYXJrZXI6IEJNYXJrZXJcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIF9zZXJ2aWNlOiBNYXBTZXJ2aWNlKSB7fVxuXG4gIHB1YmxpYyBuZ09uSW5pdCgpIHtcbiAgICBudWxsQ2hlY2sodGhpcy5wb2ludCwgJ3BvaW50IGlzIHJlcXVpcmVkIGZvciA8bWFya2VyPicpXG5cbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuYWRkT3ZlcmxheSgoKSA9PiB7XG4gICAgICAgIHJldHVybiAodGhpcy5tYXJrZXIgPSBuZXcgd2luZG93LkJNYXAuTWFya2VyKHRvUG9pbnQodGhpcy5wb2ludCksIHRvTWFya2VyT3B0aW9ucyh0aGlzLm9wdGlvbnMpKSlcbiAgICAgIH0pXG4gICAgICAudGhlbigoeyBtYXAgfSkgPT4ge1xuICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMubWFya2VyKVxuICAgICAgICB0aGlzLmFkZExpc3RlbmVyKHRoaXMubWFya2VyLCBtYXApXG4gICAgICB9KVxuICAgICAgLnRoZW4oKCkgPT4ge1xuICAgICAgICAvLyB3b3JrYXJvdW5kOiBpdCdzIHdlaXJkIHRoYXQgcG9zdGlvbiBpcyBzZXQgd2hpbGUgY29uc3RydWN0aW5nIHBoYXNlIHdpbGwgbWFrZSBjbGljayBldmVudCBub3Qgd29ya2luZ1xuICAgICAgICB0aGlzLm1hcmtlci5zZXRQb3NpdGlvbihuZXcgd2luZG93LkJNYXAuUG9pbnQodGhpcy5wb2ludC5sbmcsIHRoaXMucG9pbnQubGF0KSlcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkNoYW5nZXMoY2hhbmdlczogeyBbcHJvcGVydHlOYW1lOiBzdHJpbmddOiBTaW1wbGVDaGFuZ2UgfSkge1xuICAgIGlmIChjaGFuZ2VzLnBvaW50ICYmICFjaGFuZ2VzLnBvaW50LmlzRmlyc3RDaGFuZ2UoKSkge1xuICAgICAgdGhpcy5tYXJrZXIuc2V0UG9zaXRpb24odG9Qb2ludChjaGFuZ2VzLnBvaW50LmN1cnJlbnRWYWx1ZSkpXG4gICAgfVxuICAgIGlmIChjaGFuZ2VzLm9wdGlvbnMgJiYgIWNoYW5nZXMub3B0aW9ucy5pc0ZpcnN0Q2hhbmdlKCkpIHtcbiAgICAgIHRoaXMuc2V0T3B0aW9ucyhjaGFuZ2VzLm9wdGlvbnMuY3VycmVudFZhbHVlKVxuICAgIH1cbiAgfVxuXG4gIHB1YmxpYyBuZ09uRGVzdHJveSgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlLnJlbW92ZU92ZXJsYXkodGhpcy5tYXJrZXIpXG4gIH1cblxuICBwcml2YXRlIHNldE9wdGlvbnMob3B0aW9uczogTWFya2VyT3B0aW9ucyk6IHZvaWQge1xuICAgIGlmIChpc051bGwob3B0aW9ucykpIHtcbiAgICAgIHJldHVyblxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRpb25zLm9mZnNldCkpIHtcbiAgICAgIHRoaXMubWFya2VyLnNldE9mZnNldCh0b1NpemUob3B0aW9ucy5vZmZzZXQpKVxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRpb25zLmljb24pKSB7XG4gICAgICB0aGlzLm1hcmtlci5zZXRJY29uKHRvSWNvbihvcHRpb25zLmljb24uaW1hZ2VVcmwsIG9wdGlvbnMuaWNvbi5zaXplLCBvcHRpb25zLmljb24pKVxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRpb25zLmVuYWJsZU1hc3NDbGVhcikpIHtcbiAgICAgIHRoaXMubWFya2VyWyhvcHRpb25zLmVuYWJsZU1hc3NDbGVhciA/ICdlbmFibGUnIDogJ2Rpc2FibGUnKSArICdNYXNzQ2xlYXInXSgpXG4gICAgfVxuICAgIGlmICghaXNOdWxsKG9wdGlvbnMuZW5hYmxlRHJhZ2dpbmcpKSB7XG4gICAgICB0aGlzLm1hcmtlclsob3B0aW9ucy5lbmFibGVEcmFnZ2luZyA/ICdlbmFibGUnIDogJ2Rpc2FibGUnKSArICdEcmFnZ2luZyddKClcbiAgICB9XG4gICAgaWYgKCFpc051bGwob3B0aW9ucy5yb3RhdGlvbikpIHtcbiAgICAgIHRoaXMubWFya2VyLnNldFJvdGF0aW9uKG9wdGlvbnMucm90YXRpb24pXG4gICAgfVxuICAgIGlmICghaXNOdWxsKG9wdGlvbnMuc2hhZG93KSkge1xuICAgICAgdGhpcy5tYXJrZXIuc2V0U2hhZG93KHRvSWNvbihvcHRpb25zLnNoYWRvdy5pbWFnZVVybCwgb3B0aW9ucy5zaGFkb3cuc2l6ZSwgb3B0aW9ucy5zaGFkb3cpKVxuICAgIH1cbiAgICBpZiAoIWlzTnVsbChvcHRpb25zLnRpdGxlKSkge1xuICAgICAgdGhpcy5tYXJrZXIuc2V0VGl0bGUob3B0aW9ucy50aXRsZSlcbiAgICB9XG4gIH1cblxuICBwcml2YXRlIGFkZExpc3RlbmVyKG1hcmtlcjogQk1hcmtlciwgbWFwOiBCTWFwSW5zdGFuY2UpIHtcbiAgICBtYXJrZXIuYWRkRXZlbnRMaXN0ZW5lcignY2xpY2snLCAoZTogYW55KSA9PiB7XG4gICAgICB0aGlzLmNsaWNrZWQuZW1pdCh7XG4gICAgICAgIGUsXG4gICAgICAgIG1hcCxcbiAgICAgICAgbWFya2VyXG4gICAgICB9KVxuICAgIH0pXG4gIH1cbn1cbiIsImltcG9ydCB7XG4gIERpcmVjdGl2ZSxcbiAgRXZlbnRFbWl0dGVyLFxuICBJbnB1dCxcbiAgT25DaGFuZ2VzLFxuICBPbkRlc3Ryb3ksXG4gIE9uSW5pdCxcbiAgT3V0cHV0LFxuICBTaW1wbGVDaGFuZ2Vcbn0gZnJvbSAnQGFuZ3VsYXIvY29yZSdcblxuaW1wb3J0IHsgaXNOdWxsLCBpc1VuZGVmaW5lZCB9IGZyb20gJy4uL2hlbHBlcnMvb2JqZWN0J1xuaW1wb3J0IHsgdG9Qb2ludHMgfSBmcm9tICcuLi9oZWxwZXJzL3RyYW5zZm9ybWVyJ1xuaW1wb3J0IHsgbnVsbENoZWNrIH0gZnJvbSAnLi4vaGVscGVycy92YWxpZGF0ZSdcbmltcG9ydCB7IE1hcFNlcnZpY2UgfSBmcm9tICcuLi9wcm92aWRlcnMvbWFwU2VydmljZSdcbmltcG9ydCB7IEJQb2x5bGluZSwgUG9seWxpbmVPcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvUG9seWxpbmUnXG5pbXBvcnQgeyBQb2ludCB9IGZyb20gJy4uL3R5cGVzL1BvaW50J1xuXG5ARGlyZWN0aXZlKHtcbiAgc2VsZWN0b3I6ICdwb2x5bGluZSdcbn0pXG5leHBvcnQgY2xhc3MgUG9seWxpbmVDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uQ2hhbmdlcywgT25EZXN0cm95IHtcbiAgQElucHV0KCkgcHJpdmF0ZSBwb2ludHM6IEFycmF5PFBvaW50PlxuICBASW5wdXQoKSBwcml2YXRlIG9wdGlvbnM6IFBvbHlsaW5lT3B0aW9uc1xuXG4gIEBPdXRwdXQoKSBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIHByaXZhdGUgcG9seWxpbmU6IEJQb2x5bGluZVxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIG51bGxDaGVjayh0aGlzLnBvaW50cywgJ3BvaW50cyBpcyByZXF1aXJlZCBmb3IgPHBvbHlsaW5lPicpXG5cbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuYWRkT3ZlcmxheSgoKSA9PiB7XG4gICAgICAgIHJldHVybiAodGhpcy5wb2x5bGluZSA9IG5ldyB3aW5kb3cuQk1hcC5Qb2x5bGluZSh0b1BvaW50cyh0aGlzLnBvaW50cyksIHRoaXMub3B0aW9ucykpXG4gICAgICB9KVxuICAgICAgLnRoZW4oKCkgPT4ge1xuICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMucG9seWxpbmUpXG4gICAgICB9KVxuICB9XG5cbiAgcHVibGljIG5nT25DaGFuZ2VzKGNoYW5nZXM6IHsgW3Byb3BlcnR5TmFtZTogc3RyaW5nXTogU2ltcGxlQ2hhbmdlIH0pIHtcbiAgICBpZiAoY2hhbmdlcy5wb2ludHMgJiYgIWNoYW5nZXMucG9pbnRzLmlzRmlyc3RDaGFuZ2UoKSkge1xuICAgICAgdGhpcy5wb2x5bGluZS5zZXRQYXRoKHRvUG9pbnRzKGNoYW5nZXMucG9pbnRzLmN1cnJlbnRWYWx1ZSkpXG4gICAgfVxuICAgIGlmIChjaGFuZ2VzLm9wdGlvbnMgJiYgIWNoYW5nZXMub3B0aW9ucy5pc0ZpcnN0Q2hhbmdlKCkpIHtcbiAgICAgIHRoaXMuc2V0T3B0aW9ucyhjaGFuZ2VzLm9wdGlvbnMuY3VycmVudFZhbHVlKVxuICAgIH1cbiAgfVxuXG4gIHB1YmxpYyBuZ09uRGVzdHJveSgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlLnJlbW92ZU92ZXJsYXkodGhpcy5wb2x5bGluZSlcbiAgfVxuXG4gIHByaXZhdGUgc2V0T3B0aW9ucyhvcHRpb25zOiBQb2x5bGluZU9wdGlvbnMpOiB2b2lkIHtcbiAgICBpZiAoaXNOdWxsKG9wdGlvbnMpKSB7XG4gICAgICByZXR1cm5cbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLmVuYWJsZUVkaXRpbmcpKSB7XG4gICAgICBpZiAob3B0aW9ucy5lbmFibGVFZGl0aW5nKSB7XG4gICAgICAgIHRoaXMucG9seWxpbmUuZW5hYmxlRWRpdGluZygpXG4gICAgICB9IGVsc2Uge1xuICAgICAgICB0aGlzLnBvbHlsaW5lLmRpc2FibGVFZGl0aW5nKClcbiAgICAgIH1cbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLmVuYWJsZU1hc3NDbGVhcikpIHtcbiAgICAgIGlmIChvcHRpb25zLmVuYWJsZUVkaXRpbmcpIHtcbiAgICAgICAgdGhpcy5wb2x5bGluZS5lbmFibGVNYXNzQ2xlYXIoKVxuICAgICAgfSBlbHNlIHtcbiAgICAgICAgdGhpcy5wb2x5bGluZS5kaXNhYmxlTWFzc0NsZWFyKClcbiAgICAgIH1cbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLnN0cm9rZUNvbG9yKSkge1xuICAgICAgdGhpcy5wb2x5bGluZS5zZXRTdHJva2VDb2xvcihvcHRpb25zLnN0cm9rZUNvbG9yKVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlT3BhY2l0eSkpIHtcbiAgICAgIHRoaXMucG9seWxpbmUuc2V0U3Ryb2tlT3BhY2l0eShvcHRpb25zLnN0cm9rZU9wYWNpdHkpXG4gICAgfVxuICAgIGlmICghaXNVbmRlZmluZWQob3B0aW9ucy5zdHJva2VTdHlsZSkpIHtcbiAgICAgIHRoaXMucG9seWxpbmUuc2V0U3Ryb2tlU3R5bGUob3B0aW9ucy5zdHJva2VTdHlsZSlcbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLnN0cm9rZVdlaWdodCkpIHtcbiAgICAgIHRoaXMucG9seWxpbmUuc2V0U3Ryb2tlV2VpZ2h0KG9wdGlvbnMuc3Ryb2tlV2VpZ2h0KVxuICAgIH1cbiAgfVxufVxuIiwiaW1wb3J0IHtcbiAgRGlyZWN0aXZlLFxuICBFdmVudEVtaXR0ZXIsXG4gIElucHV0LFxuICBPbkNoYW5nZXMsXG4gIE9uRGVzdHJveSxcbiAgT25Jbml0LFxuICBPdXRwdXQsXG4gIFNpbXBsZUNoYW5nZVxufSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBpc051bGwsIGlzVW5kZWZpbmVkIH0gZnJvbSAnLi4vaGVscGVycy9vYmplY3QnXG5pbXBvcnQgeyB0b1BvaW50IH0gZnJvbSAnLi4vaGVscGVycy90cmFuc2Zvcm1lcidcbmltcG9ydCB7IG51bGxDaGVjayB9IGZyb20gJy4uL2hlbHBlcnMvdmFsaWRhdGUnXG5pbXBvcnQgeyBNYXBTZXJ2aWNlIH0gZnJvbSAnLi4vcHJvdmlkZXJzL21hcFNlcnZpY2UnXG5pbXBvcnQgeyBCQ2lyY2xlLCBDaXJjbGVPcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvQ2lyY2xlJ1xuaW1wb3J0IHsgUG9pbnQgfSBmcm9tICcuLi90eXBlcy9Qb2ludCdcblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAnY2lyY2xlJ1xufSlcbmV4cG9ydCBjbGFzcyBDaXJjbGVDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uQ2hhbmdlcywgT25EZXN0cm95IHtcbiAgQElucHV0KCkgcHJpdmF0ZSBjZW50ZXI6IFBvaW50XG4gIEBJbnB1dCgpIHByaXZhdGUgcmFkaXVzOiBudW1iZXJcbiAgQElucHV0KCkgcHJpdmF0ZSBvcHRpb25zOiBDaXJjbGVPcHRpb25zXG5cbiAgQE91dHB1dCgpIHByaXZhdGUgbG9hZGVkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSBjaXJjbGU6IEJDaXJjbGVcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIF9zZXJ2aWNlOiBNYXBTZXJ2aWNlKSB7fVxuXG4gIHB1YmxpYyBuZ09uSW5pdCgpIHtcbiAgICBudWxsQ2hlY2sodGhpcy5jZW50ZXIsICdjZW50ZXIgaXMgcmVxdWlyZWQgZm9yIDxjaXJjbGU+JylcbiAgICBudWxsQ2hlY2sodGhpcy5yYWRpdXMsICdjZW50ZXIgaXMgcmVxdWlyZWQgZm9yIDxjaXJjbGU+JylcblxuICAgIHRoaXMuX3NlcnZpY2VcbiAgICAgIC5hZGRPdmVybGF5KCgpID0+IHtcbiAgICAgICAgcmV0dXJuICh0aGlzLmNpcmNsZSA9IG5ldyB3aW5kb3cuQk1hcC5DaXJjbGUodG9Qb2ludCh0aGlzLmNlbnRlciksIHRoaXMucmFkaXVzLCB0aGlzLm9wdGlvbnMpKVxuICAgICAgfSlcbiAgICAgIC50aGVuKCgpID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdCh0aGlzLmNpcmNsZSlcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkNoYW5nZXMoY2hhbmdlczogeyBbcHJvcGVydHlOYW1lOiBzdHJpbmddOiBTaW1wbGVDaGFuZ2UgfSkge1xuICAgIGlmIChjaGFuZ2VzLmNlbnRlciAmJiAhY2hhbmdlcy5jZW50ZXIuaXNGaXJzdENoYW5nZSgpKSB7XG4gICAgICB0aGlzLmNpcmNsZS5zZXRDZW50ZXIodG9Qb2ludChjaGFuZ2VzLmNlbnRlci5jdXJyZW50VmFsdWUpKVxuICAgIH1cbiAgICBpZiAoY2hhbmdlcy5yYWRpdXMgJiYgIWNoYW5nZXMucmFkaXVzLmlzRmlyc3RDaGFuZ2UoKSkge1xuICAgICAgdGhpcy5jaXJjbGUuc2V0UmFkaXVzKGNoYW5nZXMucmFkaXVzLmN1cnJlbnRWYWx1ZSlcbiAgICB9XG4gICAgaWYgKGNoYW5nZXMub3B0aW9ucyAmJiAhY2hhbmdlcy5vcHRpb25zLmlzRmlyc3RDaGFuZ2UoKSkge1xuICAgICAgdGhpcy5zZXRPcHRpb25zKGNoYW5nZXMub3B0aW9ucy5jdXJyZW50VmFsdWUpXG4gICAgfVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIHRoaXMuX3NlcnZpY2UucmVtb3ZlT3ZlcmxheSh0aGlzLmNpcmNsZSlcbiAgfVxuXG4gIHByaXZhdGUgc2V0T3B0aW9ucyhvcHRpb25zOiBDaXJjbGVPcHRpb25zKTogdm9pZCB7XG4gICAgaWYgKGlzTnVsbChvcHRpb25zKSkge1xuICAgICAgcmV0dXJuXG4gICAgfVxuICAgIGlmICghaXNVbmRlZmluZWQob3B0aW9ucy5lbmFibGVFZGl0aW5nKSkge1xuICAgICAgaWYgKG9wdGlvbnMuZW5hYmxlRWRpdGluZykge1xuICAgICAgICB0aGlzLmNpcmNsZS5lbmFibGVFZGl0aW5nKClcbiAgICAgIH0gZWxzZSB7XG4gICAgICAgIHRoaXMuY2lyY2xlLmRpc2FibGVFZGl0aW5nKClcbiAgICAgIH1cbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLmVuYWJsZU1hc3NDbGVhcikpIHtcbiAgICAgIGlmIChvcHRpb25zLmVuYWJsZUVkaXRpbmcpIHtcbiAgICAgICAgdGhpcy5jaXJjbGUuZW5hYmxlTWFzc0NsZWFyKClcbiAgICAgIH0gZWxzZSB7XG4gICAgICAgIHRoaXMuY2lyY2xlLmRpc2FibGVNYXNzQ2xlYXIoKVxuICAgICAgfVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlQ29sb3IpKSB7XG4gICAgICB0aGlzLmNpcmNsZS5zZXRTdHJva2VDb2xvcihvcHRpb25zLnN0cm9rZUNvbG9yKVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuZmlsbENvbG9yKSkge1xuICAgICAgdGhpcy5jaXJjbGUuc2V0RmlsbENvbG9yKG9wdGlvbnMuZmlsbENvbG9yKVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlT3BhY2l0eSkpIHtcbiAgICAgIHRoaXMuY2lyY2xlLnNldFN0cm9rZU9wYWNpdHkob3B0aW9ucy5zdHJva2VPcGFjaXR5KVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuZmlsbE9wYWNpdHkpKSB7XG4gICAgICB0aGlzLmNpcmNsZS5zZXRGaWxsT3BhY2l0eShvcHRpb25zLmZpbGxPcGFjaXR5KVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlU3R5bGUpKSB7XG4gICAgICB0aGlzLmNpcmNsZS5zZXRTdHJva2VTdHlsZShvcHRpb25zLnN0cm9rZVN0eWxlKVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlV2VpZ2h0KSkge1xuICAgICAgdGhpcy5jaXJjbGUuc2V0U3Ryb2tlV2VpZ2h0KG9wdGlvbnMuc3Ryb2tlV2VpZ2h0KVxuICAgIH1cbiAgfVxufVxuIiwiaW1wb3J0IHtcbiAgRGlyZWN0aXZlLFxuICBFdmVudEVtaXR0ZXIsXG4gIElucHV0LFxuICBPbkNoYW5nZXMsXG4gIE9uRGVzdHJveSxcbiAgT25Jbml0LFxuICBPdXRwdXQsXG4gIFNpbXBsZUNoYW5nZVxufSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBpc051bGwsIGlzVW5kZWZpbmVkIH0gZnJvbSAnLi4vaGVscGVycy9vYmplY3QnXG5pbXBvcnQgeyB0b1BvaW50cyB9IGZyb20gJy4uL2hlbHBlcnMvdHJhbnNmb3JtZXInXG5pbXBvcnQgeyBudWxsQ2hlY2sgfSBmcm9tICcuLi9oZWxwZXJzL3ZhbGlkYXRlJ1xuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgQlBvbHlnb24sIFBvbHlnb25PcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvUG9seWdvbidcbmltcG9ydCB7IFBvaW50IH0gZnJvbSAnLi4vdHlwZXMvUG9pbnQnXG5cbkBEaXJlY3RpdmUoe1xuICBzZWxlY3RvcjogJ3BvbHlnb24nXG59KVxuZXhwb3J0IGNsYXNzIFBvbHlnb25Db21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uQ2hhbmdlcywgT25EZXN0cm95IHtcbiAgQElucHV0KCkgcHJpdmF0ZSBwb2ludHM6IEFycmF5PFBvaW50PlxuICBASW5wdXQoKSBwcml2YXRlIG9wdGlvbnM6IFBvbHlnb25PcHRpb25zXG5cbiAgQE91dHB1dCgpIHByaXZhdGUgbG9hZGVkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSBwb2x5Z29uOiBCUG9seWdvblxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIG51bGxDaGVjayh0aGlzLnBvaW50cywgJ3BvaW50cyBpcyByZXF1aXJlZCBmb3IgPHBvbHlnb24+JylcblxuICAgIHRoaXMuX3NlcnZpY2VcbiAgICAgIC5hZGRPdmVybGF5KCgpID0+IHtcbiAgICAgICAgcmV0dXJuICh0aGlzLnBvbHlnb24gPSBuZXcgd2luZG93LkJNYXAuUG9seWdvbih0b1BvaW50cyh0aGlzLnBvaW50cyksIHRoaXMub3B0aW9ucykpXG4gICAgICB9KVxuICAgICAgLnRoZW4oKCkgPT4ge1xuICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMucG9seWdvbilcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkNoYW5nZXMoY2hhbmdlczogeyBbcHJvcGVydHlOYW1lOiBzdHJpbmddOiBTaW1wbGVDaGFuZ2UgfSkge1xuICAgIGlmIChjaGFuZ2VzLnBvaW50cyAmJiAhY2hhbmdlcy5wb2ludHMuaXNGaXJzdENoYW5nZSgpKSB7XG4gICAgICB0aGlzLnBvbHlnb24uc2V0UGF0aCh0b1BvaW50cyhjaGFuZ2VzLnBvaW50cy5jdXJyZW50VmFsdWUpKVxuICAgIH1cbiAgICBpZiAoY2hhbmdlcy5vcHRpb25zICYmICFjaGFuZ2VzLm9wdGlvbnMuaXNGaXJzdENoYW5nZSgpKSB7XG4gICAgICB0aGlzLnNldE9wdGlvbnMoY2hhbmdlcy5vcHRpb25zLmN1cnJlbnRWYWx1ZSlcbiAgICB9XG4gIH1cblxuICBwdWJsaWMgbmdPbkRlc3Ryb3koKSB7XG4gICAgdGhpcy5fc2VydmljZS5yZW1vdmVPdmVybGF5KHRoaXMucG9seWdvbilcbiAgfVxuXG4gIHByaXZhdGUgc2V0T3B0aW9ucyhvcHRpb25zOiBQb2x5Z29uT3B0aW9ucyk6IHZvaWQge1xuICAgIGlmIChpc051bGwob3B0aW9ucykpIHtcbiAgICAgIHJldHVyblxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuZW5hYmxlRWRpdGluZykpIHtcbiAgICAgIGlmIChvcHRpb25zLmVuYWJsZUVkaXRpbmcpIHtcbiAgICAgICAgdGhpcy5wb2x5Z29uLmVuYWJsZUVkaXRpbmcoKVxuICAgICAgfSBlbHNlIHtcbiAgICAgICAgdGhpcy5wb2x5Z29uLmRpc2FibGVFZGl0aW5nKClcbiAgICAgIH1cbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLmVuYWJsZU1hc3NDbGVhcikpIHtcbiAgICAgIGlmIChvcHRpb25zLmVuYWJsZUVkaXRpbmcpIHtcbiAgICAgICAgdGhpcy5wb2x5Z29uLmVuYWJsZU1hc3NDbGVhcigpXG4gICAgICB9IGVsc2Uge1xuICAgICAgICB0aGlzLnBvbHlnb24uZGlzYWJsZU1hc3NDbGVhcigpXG4gICAgICB9XG4gICAgfVxuICAgIGlmICghaXNVbmRlZmluZWQob3B0aW9ucy5zdHJva2VDb2xvcikpIHtcbiAgICAgIHRoaXMucG9seWdvbi5zZXRTdHJva2VDb2xvcihvcHRpb25zLnN0cm9rZUNvbG9yKVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuZmlsbENvbG9yKSkge1xuICAgICAgdGhpcy5wb2x5Z29uLnNldEZpbGxDb2xvcihvcHRpb25zLmZpbGxDb2xvcilcbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLnN0cm9rZU9wYWNpdHkpKSB7XG4gICAgICB0aGlzLnBvbHlnb24uc2V0U3Ryb2tlT3BhY2l0eShvcHRpb25zLnN0cm9rZU9wYWNpdHkpXG4gICAgfVxuICAgIGlmICghaXNVbmRlZmluZWQob3B0aW9ucy5maWxsT3BhY2l0eSkpIHtcbiAgICAgIHRoaXMucG9seWdvbi5zZXRGaWxsT3BhY2l0eShvcHRpb25zLmZpbGxPcGFjaXR5KVxuICAgIH1cbiAgICBpZiAoIWlzVW5kZWZpbmVkKG9wdGlvbnMuc3Ryb2tlU3R5bGUpKSB7XG4gICAgICB0aGlzLnBvbHlnb24uc2V0U3Ryb2tlU3R5bGUob3B0aW9ucy5zdHJva2VTdHlsZSlcbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLnN0cm9rZVdlaWdodCkpIHtcbiAgICAgIHRoaXMucG9seWdvbi5zZXRTdHJva2VXZWlnaHQob3B0aW9ucy5zdHJva2VXZWlnaHQpXG4gICAgfVxuICB9XG59XG4iLCJpbXBvcnQge1xuICBEaXJlY3RpdmUsXG4gIEV2ZW50RW1pdHRlcixcbiAgSW5wdXQsXG4gIE9uQ2hhbmdlcyxcbiAgT25EZXN0cm95LFxuICBPbkluaXQsXG4gIE91dHB1dCxcbiAgU2ltcGxlQ2hhbmdlXG59IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5cbmltcG9ydCB7IG51bGxDaGVjayB9IGZyb20gJy4uL2hlbHBlcnMvdmFsaWRhdGUnXG5pbXBvcnQgeyBNYXBTZXJ2aWNlIH0gZnJvbSAnLi4vcHJvdmlkZXJzL21hcFNlcnZpY2UnXG5pbXBvcnQgeyBCSGVhdG1hcCwgSGVhdG1hcE9wdGlvbnMsIEhlYXRtYXBEYXRhIH0gZnJvbSAnLi4vdHlwZXMvSGVhdG1hcCdcbmltcG9ydCB7IFNjcmlwdExvYWRlciB9IGZyb20gJy4uL3Byb3ZpZGVycy9zY3JpcHRMb2FkZXInXG5cbmNvbnN0IExJQl9VUkwgPSBgaHR0cHM6Ly9hcGkubWFwLmJhaWR1LmNvbS9saWJyYXJ5L0hlYXRtYXAvMi4wL3NyYy9IZWF0bWFwX21pbi5qc2BcblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAnaGVhdG1hcCdcbn0pXG5leHBvcnQgY2xhc3MgSGVhdG1hcENvbXBvbmVudCBpbXBsZW1lbnRzIE9uSW5pdCwgT25DaGFuZ2VzLCBPbkRlc3Ryb3kge1xuICBASW5wdXQoKSBwcml2YXRlIGRhdGFzZXQ6IEhlYXRtYXBEYXRhXG4gIEBJbnB1dCgpIHByaXZhdGUgb3B0aW9uczogSGVhdG1hcE9wdGlvbnNcblxuICBAT3V0cHV0KCkgcHJpdmF0ZSBsb2FkZWQgPSBuZXcgRXZlbnRFbWl0dGVyKClcblxuICBwcml2YXRlIGhlYXRtYXA6IEJIZWF0bWFwXG5cbiAgY29uc3RydWN0b3IocHJpdmF0ZSBfc2VydmljZTogTWFwU2VydmljZSwgcHJpdmF0ZSBzY3JpcHRMb2FkZXI6IFNjcmlwdExvYWRlcikge31cblxuICBwdWJsaWMgbmdPbkluaXQoKSB7XG4gICAgbnVsbENoZWNrKHRoaXMuZGF0YXNldCwgJ2RhdGFzZXQgaXMgcmVxdWlyZWQgZm9yIDxoZWF0bWFwPicpXG5cbiAgICB0aGlzLl9zZXJ2aWNlLmdldE5hdGl2ZU1hcCgpLnRoZW4oKCkgPT4ge1xuICAgICAgcmV0dXJuIHRoaXMuc2NyaXB0TG9hZGVyLmxvYWQoTElCX1VSTCwgZmFsc2UsICgpID0+IHtcbiAgICAgICAgdGhpcy5fc2VydmljZVxuICAgICAgICAgIC5hZGRPdmVybGF5KCgpID0+IHtcbiAgICAgICAgICAgIHJldHVybiAodGhpcy5oZWF0bWFwID0gbmV3IHdpbmRvdy5CTWFwTGliLkhlYXRtYXBPdmVybGF5KHRoaXMub3B0aW9ucykpXG4gICAgICAgICAgfSlcbiAgICAgICAgICAudGhlbigoKSA9PiB7XG4gICAgICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMuaGVhdG1hcClcbiAgICAgICAgICAgIGlmICh0aGlzLmRhdGFzZXQpIHtcbiAgICAgICAgICAgICAgdGhpcy5oZWF0bWFwLnNldERhdGFTZXQodGhpcy5kYXRhc2V0KVxuICAgICAgICAgICAgfVxuICAgICAgICAgIH0pXG4gICAgICB9KVxuICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkNoYW5nZXMoY2hhbmdlczogeyBbcHJvcGVydHlOYW1lOiBzdHJpbmddOiBTaW1wbGVDaGFuZ2UgfSkge1xuICAgIGlmIChjaGFuZ2VzLmRhdGFzZXQgJiYgIWNoYW5nZXMuZGF0YXNldC5pc0ZpcnN0Q2hhbmdlKCkpIHtcbiAgICAgIHRoaXMuaGVhdG1hcC5zZXREYXRhU2V0KGNoYW5nZXMuZGF0YXNldC5jdXJyZW50VmFsdWUpXG4gICAgfVxuICAgIGlmIChjaGFuZ2VzLm9wdGlvbnMgJiYgIWNoYW5nZXMub3B0aW9ucy5pc0ZpcnN0Q2hhbmdlKCkpIHtcbiAgICAgIHRoaXMuaGVhdG1hcC5zZXRPcHRpb25zKGNoYW5nZXMub3B0aW9ucy5jdXJyZW50VmFsdWUpXG4gICAgfVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIHRoaXMuX3NlcnZpY2UucmVtb3ZlT3ZlcmxheSh0aGlzLmhlYXRtYXApXG4gIH1cbn1cbiIsImltcG9ydCB7IERpcmVjdGl2ZSwgRXZlbnRFbWl0dGVyLCBJbnB1dCwgT25EZXN0cm95LCBPbkluaXQsIE91dHB1dCB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5cbmltcG9ydCB7IE1hcFNlcnZpY2UgfSBmcm9tICcuLi9wcm92aWRlcnMvbWFwU2VydmljZSdcbmltcG9ydCB7IEJUaWxlTGF5ZXIsIFRpbGVMYXllck9wdGlvbnMsIGdldFRpbGVzVXJsRnVuYyB9IGZyb20gJy4uL3R5cGVzL1RpbGVMYXllcidcbmltcG9ydCB7IEJQaXhlbCB9IGZyb20gJy4uL3R5cGVzL1BpeGVsJ1xuXG5ARGlyZWN0aXZlKHtcbiAgc2VsZWN0b3I6ICd0aWxlbGF5ZXInXG59KVxuZXhwb3J0IGNsYXNzIFRpbGVMYXllckNvbXBvbmVudCBpbXBsZW1lbnRzIE9uSW5pdCwgT25EZXN0cm95IHtcbiAgQElucHV0KClcbiAgcHJpdmF0ZSBnZXRUaWxlc1VybDogZ2V0VGlsZXNVcmxGdW5jXG4gIEBJbnB1dCgpXG4gIHByaXZhdGUgb3B0aW9uczogVGlsZUxheWVyT3B0aW9uc1xuXG4gIEBPdXRwdXQoKVxuICBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIHByaXZhdGUgdGlsZWxheWVyOiBCVGlsZUxheWVyXG5cbiAgY29uc3RydWN0b3IocHJpdmF0ZSBfc2VydmljZTogTWFwU2VydmljZSkge31cblxuICBwdWJsaWMgbmdPbkluaXQoKSB7XG4gICAgY29uc3QgZnVuYyA9IHRoaXMuZ2V0VGlsZXNVcmxcblxuICAgIHRoaXMuX3NlcnZpY2VcbiAgICAgIC5hZGRUaWxlTGF5ZXIoKCkgPT4ge1xuICAgICAgICB0aGlzLnRpbGVsYXllciA9IG5ldyB3aW5kb3cuQk1hcC5UaWxlTGF5ZXIodGhpcy5vcHRpb25zKVxuXG4gICAgICAgIGlmICh0aGlzLmdldFRpbGVzVXJsKSB7XG4gICAgICAgICAgdGhpcy50aWxlbGF5ZXIuZ2V0VGlsZXNVcmwgPSBmdW5jdGlvbih0aWxlQ29vcmQ6IEJQaXhlbCwgem9vbTogbnVtYmVyKSB7XG4gICAgICAgICAgICByZXR1cm4gZnVuYyh0aWxlQ29vcmQsIHpvb20pXG4gICAgICAgICAgfVxuICAgICAgICB9XG4gICAgICAgIHJldHVybiB0aGlzLnRpbGVsYXllclxuICAgICAgfSlcbiAgICAgIC50aGVuKCgpID0+IHtcbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdCh0aGlzLnRpbGVsYXllcilcbiAgICAgIH0pXG4gIH1cblxuICBwdWJsaWMgbmdPbkRlc3Ryb3koKSB7XG4gICAgdGhpcy5fc2VydmljZS5yZW1vdmVUaWxlTGF5ZXIodGhpcy50aWxlbGF5ZXIpXG4gIH1cbn1cbiIsImltcG9ydCB7IERpcmVjdGl2ZSwgRXZlbnRFbWl0dGVyLCBJbnB1dCwgT25EZXN0cm95LCBPbkluaXQsIE91dHB1dCB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnXG5cbmltcG9ydCB7IE1hcFNlcnZpY2UgfSBmcm9tICcuLi9wcm92aWRlcnMvbWFwU2VydmljZSdcbmltcG9ydCB7IEJUcmFmZmljTGF5ZXIsIFRyYWZmaWNMYXllck9wdGlvbnMgfSBmcm9tICcuLi90eXBlcy9UcmFmZmljTGF5ZXInXG5cbkBEaXJlY3RpdmUoe1xuICBzZWxlY3RvcjogJ3RyYWZmaWNsYXllcidcbn0pXG5leHBvcnQgY2xhc3MgVHJhZmZpY0xheWVyQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0LCBPbkRlc3Ryb3kge1xuICBASW5wdXQoKVxuICBwcml2YXRlIG9wdGlvbnM6IFRyYWZmaWNMYXllck9wdGlvbnNcblxuICBAT3V0cHV0KClcbiAgcHJpdmF0ZSBsb2FkZWQgPSBuZXcgRXZlbnRFbWl0dGVyKClcblxuICBwcml2YXRlIHRyYWZmaWNsYXllcjogQlRyYWZmaWNMYXllclxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIHRoaXMuX3NlcnZpY2VcbiAgICAgIC5hZGRUaWxlTGF5ZXIoKCkgPT4ge1xuICAgICAgICB0aGlzLnRyYWZmaWNsYXllciA9IG5ldyB3aW5kb3cuQk1hcC5UcmFmZmljTGF5ZXIodGhpcy5vcHRpb25zKVxuICAgICAgICByZXR1cm4gdGhpcy50cmFmZmljbGF5ZXJcbiAgICAgIH0pXG4gICAgICAudGhlbigoKSA9PiB7XG4gICAgICAgIHRoaXMubG9hZGVkLmVtaXQodGhpcy50cmFmZmljbGF5ZXIpXG4gICAgICB9KVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIHRoaXMuX3NlcnZpY2UucmVtb3ZlVGlsZUxheWVyKHRoaXMudHJhZmZpY2xheWVyKVxuICB9XG59XG4iLCJpbXBvcnQgeyBEaXJlY3RpdmUsIEV2ZW50RW1pdHRlciwgSW5wdXQsIE9uRGVzdHJveSwgT25Jbml0LCBPdXRwdXQgfSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBNYXBTZXJ2aWNlIH0gZnJvbSAnLi4vcHJvdmlkZXJzL21hcFNlcnZpY2UnXG5pbXBvcnQgeyBCQ2FudmFzTGF5ZXIsIENhbnZhc0xheWVyT3B0aW9ucywgQkNhbnZhc0xheWVyT3B0aW9ucyB9IGZyb20gJy4uL3R5cGVzL0NhbnZhc0xheWVyJ1xuaW1wb3J0IHsgaXNOdW1iZXIgfSBmcm9tICcuLi9oZWxwZXJzL29iamVjdCdcbmltcG9ydCB7IEJNYXBJbnN0YW5jZSB9IGZyb20gJy4uL3R5cGVzL01hcCdcblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAnY2FudmFzbGF5ZXInXG59KVxuZXhwb3J0IGNsYXNzIENhbnZhc0xheWVyQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0LCBPbkRlc3Ryb3kge1xuICBASW5wdXQoKVxuICBwcml2YXRlIG9wdGlvbnM6IENhbnZhc0xheWVyT3B0aW9uc1xuXG4gIEBPdXRwdXQoKVxuICBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIHByaXZhdGUgY2FudmFzbGF5ZXI6IEJDYW52YXNMYXllclxuXG4gIGNvbnN0cnVjdG9yKHByaXZhdGUgX3NlcnZpY2U6IE1hcFNlcnZpY2UpIHt9XG5cbiAgcHVibGljIG5nT25Jbml0KCkge1xuICAgIHRoaXMuX3NlcnZpY2VcbiAgICAgIC5hZGRPdmVybGF5KChtYXA6IEJNYXBJbnN0YW5jZSkgPT4ge1xuICAgICAgICB0aGlzLmNhbnZhc2xheWVyID0gbmV3IHdpbmRvdy5CTWFwLkNhbnZhc0xheWVyKHRoaXMuZ2V0T3B0aW9ucyh0aGlzLm9wdGlvbnMsIG1hcCkpXG4gICAgICAgIHJldHVybiB0aGlzLmNhbnZhc2xheWVyXG4gICAgICB9KVxuICAgICAgLnRoZW4oKCkgPT4ge1xuICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMuY2FudmFzbGF5ZXIpXG4gICAgICB9KVxuICB9XG5cbiAgcHVibGljIG5nT25EZXN0cm95KCkge1xuICAgIHRoaXMuX3NlcnZpY2UucmVtb3ZlT3ZlcmxheSh0aGlzLmNhbnZhc2xheWVyKVxuICB9XG5cbiAgcHJpdmF0ZSBnZXRPcHRpb25zKG9wdGlvbnM6IENhbnZhc0xheWVyT3B0aW9ucywgbWFwOiBCTWFwSW5zdGFuY2UpOiBCQ2FudmFzTGF5ZXJPcHRpb25zIHwgdW5kZWZpbmVkIHtcbiAgICBpZiAoIW9wdGlvbnMpIHtcbiAgICAgIHJldHVyblxuICAgIH1cbiAgICBjb25zdCBvcHRzOiBCQ2FudmFzTGF5ZXJPcHRpb25zID0ge31cblxuICAgIGlmIChpc051bWJlcihvcHRpb25zLnpJbmRleCkpIHtcbiAgICAgIG9wdHMuekluZGV4ID0gb3B0aW9ucy56SW5kZXhcbiAgICB9XG4gICAgaWYgKG9wdGlvbnMucGFuZU5hbWUpIHtcbiAgICAgIG9wdHMucGFuZU5hbWUgPSBvcHRpb25zLnBhbmVOYW1lXG4gICAgfVxuICAgIGlmIChvcHRpb25zLnVwZGF0ZSkge1xuICAgICAgb3B0cy51cGRhdGUgPSBmdW5jdGlvbigpIHtcbiAgICAgICAgcmV0dXJuIG9wdGlvbnMudXBkYXRlKG1hcCwgdGhpcy5jYW52YXMpXG4gICAgICB9XG4gICAgfVxuXG4gICAgcmV0dXJuIG9wdHNcbiAgfVxufVxuIiwiaW1wb3J0IHtcbiAgRGlyZWN0aXZlLFxuICBFdmVudEVtaXR0ZXIsXG4gIElucHV0LFxuICBPbkNoYW5nZXMsXG4gIE9uRGVzdHJveSxcbiAgT25Jbml0LFxuICBPdXRwdXQsXG4gIFNpbXBsZUNoYW5nZVxufSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBudWxsQ2hlY2sgfSBmcm9tICcuLi9oZWxwZXJzL3ZhbGlkYXRlJ1xuaW1wb3J0IHsgaXNVbmRlZmluZWQgfSBmcm9tICcuLi9oZWxwZXJzL29iamVjdCdcbmltcG9ydCB7IHRvTWFya2VyQ2x1c3RlcmVyT3B0aW9ucywgdG9Qb2ludCwgdG9NYXJrZXJPcHRpb25zLCB0b1RleHRJY29uU3R5bGUgfSBmcm9tICcuLi9oZWxwZXJzL3RyYW5zZm9ybWVyJ1xuaW1wb3J0IHsgTWFwU2VydmljZSB9IGZyb20gJy4uL3Byb3ZpZGVycy9tYXBTZXJ2aWNlJ1xuaW1wb3J0IHsgTWFya2VyQ2x1c3RlcmVyT3B0aW9ucywgQk1hcmtlckNsdXN0ZXJlciB9IGZyb20gJy4uL3R5cGVzL01hcmtlckNsdXN0ZXJlcidcbmltcG9ydCB7IFNjcmlwdExvYWRlciB9IGZyb20gJy4uL3Byb3ZpZGVycy9zY3JpcHRMb2FkZXInXG5pbXBvcnQgeyBCTWFwSW5zdGFuY2UgfSBmcm9tICcuLi90eXBlcy9NYXAnXG5cbmNvbnN0IExJQl9VUkxTID0ge1xuICBrZXk6ICdtYXJrZXJDbHVzdGVyZXInLFxuICBzY3JpcHRzOiBbXG4gICAgJ2h0dHBzOi8vYXBpLm1hcC5iYWlkdS5jb20vbGlicmFyeS9NYXJrZXJDbHVzdGVyZXIvMS4yL3NyYy9NYXJrZXJDbHVzdGVyZXJfbWluLmpzJyxcbiAgICAnaHR0cHM6Ly9hcGkubWFwLmJhaWR1LmNvbS9saWJyYXJ5L1RleHRJY29uT3ZlcmxheS8xLjIvc3JjL1RleHRJY29uT3ZlcmxheV9taW4uanMnXG4gIF1cbn1cblxuQERpcmVjdGl2ZSh7XG4gIHNlbGVjdG9yOiAnbWFya2VyLWNsdXN0ZXJlcidcbn0pXG5leHBvcnQgY2xhc3MgTWFya2VyQ2x1c3RlcmVyQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0LCBPbkNoYW5nZXMsIE9uRGVzdHJveSB7XG4gIEBJbnB1dCgpIHByaXZhdGUgb3B0aW9uczogTWFya2VyQ2x1c3RlcmVyT3B0aW9uc1xuXG4gIEBPdXRwdXQoKSBwcml2YXRlIGxvYWRlZCA9IG5ldyBFdmVudEVtaXR0ZXIoKVxuXG4gIHByaXZhdGUgbWFya2VyQ2x1c3RlcmVyOiBCTWFya2VyQ2x1c3RlcmVyXG5cbiAgY29uc3RydWN0b3IocHJpdmF0ZSBfc2VydmljZTogTWFwU2VydmljZSwgcHJpdmF0ZSBzY3JpcHRMb2FkZXI6IFNjcmlwdExvYWRlcikge31cblxuICBwdWJsaWMgbmdPbkluaXQoKSB7XG4gICAgbnVsbENoZWNrKHRoaXMub3B0aW9ucywgJ29wdGlvbnMgaXMgcmVxdWlyZWQgZm9yIDxtYXJrZXItY2x1c3RlcmVyPicpXG5cbiAgICB0aGlzLl9zZXJ2aWNlLmdldE5hdGl2ZU1hcCgpLnRoZW4oKG1hcDogQk1hcEluc3RhbmNlKSA9PiB7XG4gICAgICByZXR1cm4gdGhpcy5zY3JpcHRMb2FkZXIubG9hZChMSUJfVVJMUywgZmFsc2UsICgpID0+IHtcbiAgICAgICAgdGhpcy5tYXJrZXJDbHVzdGVyZXIgPSBuZXcgd2luZG93LkJNYXBMaWIuTWFya2VyQ2x1c3RlcmVyKG1hcCwgdG9NYXJrZXJDbHVzdGVyZXJPcHRpb25zKHRoaXMub3B0aW9ucykpXG5cbiAgICAgICAgdGhpcy5sb2FkZWQuZW1pdCh0aGlzLm1hcmtlckNsdXN0ZXJlcilcbiAgICAgIH0pXG4gICAgfSlcbiAgfVxuXG4gIHB1YmxpYyBuZ09uQ2hhbmdlcyhjaGFuZ2VzOiB7IFtwcm9wZXJ0eU5hbWU6IHN0cmluZ106IFNpbXBsZUNoYW5nZSB9KSB7XG4gICAgaWYgKGNoYW5nZXMub3B0aW9ucyAmJiAhY2hhbmdlcy5vcHRpb25zLmlzRmlyc3RDaGFuZ2UoKSkge1xuICAgICAgdGhpcy5yZXNldE9wdGlvbnMoY2hhbmdlcy5vcHRpb25zLmN1cnJlbnRWYWx1ZSlcbiAgICB9XG4gIH1cblxuICBwcml2YXRlIHJlc2V0T3B0aW9ucyhvcHRpb25zOiBNYXJrZXJDbHVzdGVyZXJPcHRpb25zKSB7XG4gICAgaWYgKG9wdGlvbnMubWFya2Vycykge1xuICAgICAgdGhpcy5tYXJrZXJDbHVzdGVyZXIuY2xlYXJNYXJrZXJzKClcbiAgICAgIHRoaXMubWFya2VyQ2x1c3RlcmVyLmFkZE1hcmtlcnMoXG4gICAgICAgIG9wdGlvbnMubWFya2Vycy5tYXAobSA9PiBuZXcgd2luZG93LkJNYXAuTWFya2VyKHRvUG9pbnQobS5wb2ludCksIHRvTWFya2VyT3B0aW9ucyhtLm9wdGlvbnMpKSlcbiAgICAgIClcbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLmdpcmRTaXplKSkge1xuICAgICAgdGhpcy5tYXJrZXJDbHVzdGVyZXIuc2V0R3JpZFNpemUob3B0aW9ucy5naXJkU2l6ZSlcbiAgICB9XG4gICAgaWYgKCFpc1VuZGVmaW5lZChvcHRpb25zLm1heFpvb20pKSB7XG4gICAgICB0aGlzLm1hcmtlckNsdXN0ZXJlci5zZXRNYXhab29tKG9wdGlvbnMubWF4Wm9vbSlcbiAgICB9XG4gICAgaWYgKG9wdGlvbnMuc3R5bGVzKSB7XG4gICAgICB0aGlzLm1hcmtlckNsdXN0ZXJlci5zZXRTdHlsZXMob3B0aW9ucy5zdHlsZXMuZmlsdGVyKHMgPT4gcykubWFwKHMgPT4gdG9UZXh0SWNvblN0eWxlKHMpKSlcbiAgICB9XG4gIH1cblxuICBwdWJsaWMgbmdPbkRlc3Ryb3koKSB7XG4gICAgdGhpcy5tYXJrZXJDbHVzdGVyZXIuY2xlYXJNYXJrZXJzKClcbiAgfVxufVxuIiwiaW1wb3J0IHsgQkljb24sIEljb24gfSBmcm9tICcuL0ljb24nXG5pbXBvcnQgeyBCU2l6ZSwgU2l6ZSB9IGZyb20gJy4vU2l6ZSdcblxuZXhwb3J0IGludGVyZmFjZSBCQ29udHJvbENvbnN0cnVjdG9yIHtcbiAgbmV3IChvcHRzOiBhbnkpOiBCQ29udHJvbFxufVxuXG5leHBvcnQgaW50ZXJmYWNlIEJDb250cm9sIHt9XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk5hdmlnYXRpb25Db250cm9sQ29uc3RydWN0b3IgZXh0ZW5kcyBCQ29udHJvbENvbnN0cnVjdG9yIHtcbiAgbmV3IChvcHRzOiBCTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zKTogQk5hdmlnYXRpb25Db250cm9sXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk92ZXJ2aWV3TWFwQ29udHJvbENvbnN0cnVjdG9yIGV4dGVuZHMgQkNvbnRyb2xDb25zdHJ1Y3RvciB7XG4gIG5ldyAob3B0czogQk92ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMpOiBCT3ZlcnZpZXdNYXBDb250cm9sXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQlNjYWxlQ29udHJvbENvbnN0cnVjdG9yIGV4dGVuZHMgQkNvbnRyb2xDb25zdHJ1Y3RvciB7XG4gIG5ldyAob3B0czogQlNjYWxlQ29udHJvbE9wdGlvbnMpOiBCU2NhbGVDb250cm9sXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk1hcFR5cGVDb250cm9sQ29uc3RydWN0b3IgZXh0ZW5kcyBCQ29udHJvbENvbnN0cnVjdG9yIHtcbiAgbmV3IChvcHRzOiBCTWFwVHlwZUNvbnRyb2xPcHRpb25zKTogQk1hcFR5cGVDb250cm9sXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQkdlb2xvY2F0aW9uQ29uc3RydWN0b3IgZXh0ZW5kcyBCQ29udHJvbENvbnN0cnVjdG9yIHtcbiAgbmV3IChvcHRzOiBCR2VvbG9jYXRpb25Db250cm9sT3B0aW9ucyk6IEJHZW9sb2NhdGlvbkNvbnRyb2xcbn1cblxuZXhwb3J0IGludGVyZmFjZSBCUGFub3JhbWFDb250cm9sQ29uc3RydWN0b3IgZXh0ZW5kcyBCQ29udHJvbENvbnN0cnVjdG9yIHtcbiAgbmV3ICgpOiBCUGFub3JhbWFDb250cm9sQ29udHJvbFxufVxuXG5leHBvcnQgaW50ZXJmYWNlIEJOYXZpZ2F0aW9uQ29udHJvbCBleHRlbmRzIEJDb250cm9sIHtcbiAgZ2V0VHlwZSgpOiBOYXZpZ2F0aW9uQ29udHJvbFR5cGVcbiAgc2V0VHlwZSh0eXBlOiBOYXZpZ2F0aW9uQ29udHJvbFR5cGUpOiB2b2lkXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk92ZXJ2aWV3TWFwQ29udHJvbCBleHRlbmRzIEJDb250cm9sIHtcbiAgY2hhbmdlVmlldygpOiB2b2lkXG4gIHNldFNpemUoc2l6ZTogQlNpemUpOiB2b2lkXG4gIGdldFNpemUoKTogQlNpemVcbn1cblxuZXhwb3J0IGludGVyZmFjZSBCU2NhbGVDb250cm9sIGV4dGVuZHMgQkNvbnRyb2wge1xuICBnZXRVbml0KCk6IExlbmd0aFVuaXRcbiAgc2V0VW5pdCh1bml0OiBMZW5ndGhVbml0KTogdm9pZFxufVxuXG5leHBvcnQgaW50ZXJmYWNlIEJNYXBUeXBlQ29udHJvbCBleHRlbmRzIEJDb250cm9sIHt9XG5cbmV4cG9ydCBpbnRlcmZhY2UgQkdlb2xvY2F0aW9uQ29udHJvbCBleHRlbmRzIEJDb250cm9sIHtcbiAgbG9jYXRpb24oKTogdm9pZFxuICBnZXRBZGRyZXNzQ29tcG9uZW50KCk6IEFkZHJlc3NDb21wb25lbnRcbn1cblxuZXhwb3J0IGludGVyZmFjZSBCUGFub3JhbWFDb250cm9sQ29udHJvbCBleHRlbmRzIEJDb250cm9sIHt9XG5cbmV4cG9ydCBpbnRlcmZhY2UgQ29udHJvbE9wdGlvbnMge1xuICBhbmNob3I/OiBDb250cm9sQW5jaG9yXG4gIG9mZnNldD86IFNpemVcbn1cblxuZXhwb3J0IGludGVyZmFjZSBCQ29udHJvbE9wdGlvbnMge1xuICBhbmNob3I/OiBDb250cm9sQW5jaG9yXG4gIG9mZnNldD86IEJTaXplXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zIGV4dGVuZHMgQ29udHJvbE9wdGlvbnMge1xuICB0eXBlPzogTmF2aWdhdGlvbkNvbnRyb2xUeXBlXG4gIHNob3dab29tSW5mbz86IGJvb2xlYW5cbiAgZW5hYmxlR2VvbG9jYXRpb24/OiBib29sZWFuXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk5hdmlnYXRpb25Db250cm9sT3B0aW9ucyBleHRlbmRzIEJDb250cm9sT3B0aW9ucyB7XG4gIHR5cGU/OiBOYXZpZ2F0aW9uQ29udHJvbFR5cGVcbiAgc2hvd1pvb21JbmZvPzogYm9vbGVhblxuICBlbmFibGVHZW9sb2NhdGlvbj86IGJvb2xlYW5cbn1cblxuZXhwb3J0IGludGVyZmFjZSBPdmVydmlld01hcENvbnRyb2xPcHRpb25zIGV4dGVuZHMgQ29udHJvbE9wdGlvbnMge1xuICBzaXplPzogU2l6ZVxuICBpc09wZW4/OiBib29sZWFuXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgQk92ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMgZXh0ZW5kcyBCQ29udHJvbE9wdGlvbnMge1xuICBzaXplPzogQlNpemVcbiAgaXNPcGVuPzogYm9vbGVhblxufVxuXG5leHBvcnQgaW50ZXJmYWNlIFNjYWxlQ29udHJvbE9wdGlvbnMgZXh0ZW5kcyBDb250cm9sT3B0aW9ucyB7fVxuXG5leHBvcnQgaW50ZXJmYWNlIEJTY2FsZUNvbnRyb2xPcHRpb25zIGV4dGVuZHMgQkNvbnRyb2xPcHRpb25zIHt9XG5cbmV4cG9ydCBpbnRlcmZhY2UgTWFwVHlwZUNvbnRyb2xPcHRpb25zIHtcbiAgdHlwZT86IE1hcFR5cGVDb250cm9sVHlwZVxufVxuXG5leHBvcnQgaW50ZXJmYWNlIEJNYXBUeXBlQ29udHJvbE9wdGlvbnMge1xuICB0eXBlPzogTWFwVHlwZUNvbnRyb2xUeXBlXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgR2VvbG9jYXRpb25Db250cm9sT3B0aW9ucyBleHRlbmRzIENvbnRyb2xPcHRpb25zIHtcbiAgc2hvd0FkZHJlc3NCYXI/OiBib29sZWFuXG4gIGVuYWJsZUF1dG9Mb2NhdGlvbj86IGJvb2xlYW5cbiAgbG9jYXRpb25JY29uPzogSWNvblxufVxuXG5leHBvcnQgaW50ZXJmYWNlIEJHZW9sb2NhdGlvbkNvbnRyb2xPcHRpb25zIGV4dGVuZHMgQkNvbnRyb2xPcHRpb25zIHtcbiAgc2hvd0FkZHJlc3NCYXI/OiBib29sZWFuXG4gIGVuYWJsZUF1dG9Mb2NhdGlvbj86IGJvb2xlYW5cbiAgbG9jYXRpb25JY29uPzogQkljb25cbn1cblxuZXhwb3J0IGVudW0gQ29udHJvbEFuY2hvciB7XG4gIEJNQVBfQU5DSE9SX1RPUF9MRUZUID0gMCxcbiAgQk1BUF9BTkNIT1JfVE9QX1JJR0hUID0gMSxcbiAgQk1BUF9BTkNIT1JfQk9UVE9NX0xFRlQgPSAyLFxuICBCTUFQX0FOQ0hPUl9CT1RUT01fUklHSFQgPSAzXG59XG5cbmV4cG9ydCBlbnVtIE5hdmlnYXRpb25Db250cm9sVHlwZSB7XG4gIEJNQVBfTkFWSUdBVElPTl9DT05UUk9MX0xBUkdFID0gMCxcbiAgQk1BUF9OQVZJR0FUSU9OX0NPTlRST0xfU01BTEwgPSAxLFxuICBCTUFQX05BVklHQVRJT05fQ09OVFJPTF9QQU4gPSAyLFxuICBCTUFQX05BVklHQVRJT05fQ09OVFJPTF9aT09NID0gM1xufVxuXG5leHBvcnQgZW51bSBNYXBUeXBlQ29udHJvbFR5cGUge1xuICBCTUFQX01BUFRZUEVfQ09OVFJPTF9IT1JJWk9OVEFMID0gMCxcbiAgQk1BUF9NQVBUWVBFX0NPTlRST0xfRFJPUERPV04gPSAxLFxuICBCTUFQX01BUFRZUEVfQ09OVFJPTF9NQVAgPSAyXG59XG5cbmV4cG9ydCBlbnVtIExlbmd0aFVuaXQge1xuICBCTUFQX1VOSVRfTUVUUklDID0gJ21ldHJpYycsXG4gIEJNQVBfVU5JVF9JTVBFUklBTCA9ICd1cydcbn1cblxuZXhwb3J0IGludGVyZmFjZSBBZGRyZXNzQ29tcG9uZW50IHtcbiAgc3RyZWV0TnVtYmVyOiBzdHJpbmdcbiAgc3RyZWV0OiBzdHJpbmdcbiAgZGlzdHJpY3Q6IHN0cmluZ1xuICBjaXR5OiBzdHJpbmdcbiAgcHJvdmluY2U6IHN0cmluZ1xufVxuXG5leHBvcnQgdHlwZSBDb250cm9sVHlwZSA9ICduYXZpZ2F0aW9uJyB8ICdvdmVydmlld21hcCcgfCAnc2NhbGUnIHwgJ21hcHR5cGUnIHwgJ2dlb2xvY2F0aW9uJyB8ICdwYW5vcmFtYSdcbiIsImltcG9ydCB7IE1vZHVsZVdpdGhQcm92aWRlcnMsIE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSdcblxuaW1wb3J0IHsgQ29udHJvbENvbXBvbmVudCB9IGZyb20gJy4vY29tcG9uZW50cy9jb250cm9sLmNvbXBvbmVudCdcbmltcG9ydCB7IE1hcENvbXBvbmVudCB9IGZyb20gJy4vY29tcG9uZW50cy9tYXAuY29tcG9uZW50J1xuaW1wb3J0IHsgTWFya2VyQ29tcG9uZW50IH0gZnJvbSAnLi9jb21wb25lbnRzL21hcmtlci5jb21wb25lbnQnXG5pbXBvcnQgeyBQb2x5bGluZUNvbXBvbmVudCB9IGZyb20gJy4vY29tcG9uZW50cy9wb2x5bGluZS5jb21wb25lbnQnXG5pbXBvcnQgeyBDaXJjbGVDb21wb25lbnQgfSBmcm9tICcuL2NvbXBvbmVudHMvY2lyY2xlLmNvbXBvbmVudCdcbmltcG9ydCB7IFBvbHlnb25Db21wb25lbnQgfSBmcm9tICcuL2NvbXBvbmVudHMvcG9seWdvbi5jb21wb25lbnQnXG5pbXBvcnQgeyBIZWF0bWFwQ29tcG9uZW50IH0gZnJvbSAnLi9jb21wb25lbnRzL2hlYXRtYXAuY29tcG9uZW50J1xuaW1wb3J0IHsgVGlsZUxheWVyQ29tcG9uZW50IH0gZnJvbSAnLi9jb21wb25lbnRzL3RpbGVsYXllci5jb21wb25lbnQnXG5pbXBvcnQgeyBUcmFmZmljTGF5ZXJDb21wb25lbnQgfSBmcm9tICcuL2NvbXBvbmVudHMvdHJhZmZpY2xheWVyLmNvbXBvbmVudCdcbmltcG9ydCB7IENhbnZhc0xheWVyQ29tcG9uZW50IH0gZnJvbSAnLi9jb21wb25lbnRzL2NhbnZhc2xheWVyLmNvbXBvbmVudCdcbmltcG9ydCB7IE1hcmtlckNsdXN0ZXJlckNvbXBvbmVudCB9IGZyb20gJy4vY29tcG9uZW50cy9tYXJrZXJDbHVzdGVyZXIuY29tcG9uZW50J1xuaW1wb3J0IHsgTE9BRElOR19TVEFURSwgU2NyaXB0TG9hZGVyLCBTY3JpcHRMb2FkZXJDb25maWcgfSBmcm9tICcuL3Byb3ZpZGVycy9zY3JpcHRMb2FkZXInXG5cbmltcG9ydCB7IEJNYXAgfSBmcm9tICcuL3R5cGVzL0JNYXAnXG5pbXBvcnQgeyBCTWFwTGliIH0gZnJvbSAnLi90eXBlcy9CTWFwTGliJ1xuXG5ATmdNb2R1bGUoe1xuICBkZWNsYXJhdGlvbnM6IFtcbiAgICBNYXBDb21wb25lbnQsXG4gICAgTWFya2VyQ29tcG9uZW50LFxuICAgIENvbnRyb2xDb21wb25lbnQsXG4gICAgUG9seWxpbmVDb21wb25lbnQsXG4gICAgQ2lyY2xlQ29tcG9uZW50LFxuICAgIFBvbHlnb25Db21wb25lbnQsXG4gICAgSGVhdG1hcENvbXBvbmVudCxcbiAgICBUaWxlTGF5ZXJDb21wb25lbnQsXG4gICAgVHJhZmZpY0xheWVyQ29tcG9uZW50LFxuICAgIENhbnZhc0xheWVyQ29tcG9uZW50LFxuICAgIE1hcmtlckNsdXN0ZXJlckNvbXBvbmVudFxuICBdLFxuICBleHBvcnRzOiBbXG4gICAgTWFwQ29tcG9uZW50LFxuICAgIE1hcmtlckNvbXBvbmVudCxcbiAgICBDb250cm9sQ29tcG9uZW50LFxuICAgIFBvbHlsaW5lQ29tcG9uZW50LFxuICAgIENpcmNsZUNvbXBvbmVudCxcbiAgICBQb2x5Z29uQ29tcG9uZW50LFxuICAgIEhlYXRtYXBDb21wb25lbnQsXG4gICAgVGlsZUxheWVyQ29tcG9uZW50LFxuICAgIFRyYWZmaWNMYXllckNvbXBvbmVudCxcbiAgICBDYW52YXNMYXllckNvbXBvbmVudCxcbiAgICBNYXJrZXJDbHVzdGVyZXJDb21wb25lbnRcbiAgXVxufSlcbmV4cG9ydCBjbGFzcyBCYWlkdU1hcE1vZHVsZSB7XG4gIHB1YmxpYyBzdGF0aWMgZm9yUm9vdChfY29uZmlnPzogU2NyaXB0TG9hZGVyQ29uZmlnKTogTW9kdWxlV2l0aFByb3ZpZGVycyB7XG4gICAgcmV0dXJuIHtcbiAgICAgIG5nTW9kdWxlOiBCYWlkdU1hcE1vZHVsZSxcbiAgICAgIHByb3ZpZGVyczogW3sgcHJvdmlkZTogU2NyaXB0TG9hZGVyQ29uZmlnLCB1c2VWYWx1ZTogX2NvbmZpZyB9LCBTY3JpcHRMb2FkZXJdXG4gICAgfVxuICB9XG59XG5cbmV4cG9ydCB7IEJNYXBJbnN0YW5jZSwgTWFwT3B0aW9ucywgTWFwVHlwZUVudW0gfSBmcm9tICcuL3R5cGVzL01hcCdcbmV4cG9ydCB7IEJNYXBUeXBlIH0gZnJvbSAnLi90eXBlcy9NYXBUeXBlJ1xuZXhwb3J0IHsgQlByb2plY3Rpb24gfSBmcm9tICcuL3R5cGVzL1Byb2plY3Rpb24nXG5leHBvcnQgeyBQb2ludCB9IGZyb20gJy4vdHlwZXMvUG9pbnQnXG5leHBvcnQgeyBCTWFya2VyLCBNYXJrZXIsIE1hcmtlck9wdGlvbnMgfSBmcm9tICcuL3R5cGVzL01hcmtlcidcbmV4cG9ydCB7IEJQb2x5bGluZSwgUG9seWxpbmVPcHRpb25zIH0gZnJvbSAnLi90eXBlcy9Qb2x5bGluZSdcbmV4cG9ydCB7IEJDaXJjbGUsIENpcmNsZU9wdGlvbnMgfSBmcm9tICcuL3R5cGVzL0NpcmNsZSdcbmV4cG9ydCB7IEJQb2x5Z29uLCBQb2x5Z29uT3B0aW9ucyB9IGZyb20gJy4vdHlwZXMvUG9seWdvbidcbmV4cG9ydCB7IEJIZWF0bWFwLCBIZWF0bWFwT3B0aW9ucywgSGVhdG1hcERhdGEgfSBmcm9tICcuL3R5cGVzL0hlYXRtYXAnXG5leHBvcnQgeyBCVGlsZUxheWVyLCBUaWxlTGF5ZXJPcHRpb25zLCBnZXRUaWxlc1VybEZ1bmMgfSBmcm9tICcuL3R5cGVzL1RpbGVMYXllcidcbmV4cG9ydCB7IEJUcmFmZmljTGF5ZXIsIFRyYWZmaWNMYXllck9wdGlvbnMsIFByZWRpY3REYXRlIH0gZnJvbSAnLi90eXBlcy9UcmFmZmljTGF5ZXInXG5leHBvcnQgeyBCQ2FudmFzTGF5ZXIsIENhbnZhc0xheWVyT3B0aW9ucyB9IGZyb20gJy4vdHlwZXMvQ2FudmFzTGF5ZXInXG5leHBvcnQgeyBCTWFya2VyQ2x1c3RlcmVyLCBNYXJrZXJDbHVzdGVyZXJPcHRpb25zIH0gZnJvbSAnLi90eXBlcy9NYXJrZXJDbHVzdGVyZXInXG5leHBvcnQgeyBUZXh0SWNvblN0eWxlIH0gZnJvbSAnLi90eXBlcy9UZXh0SWNvbk92ZXJsYXknXG5leHBvcnQge1xuICBCQ29udHJvbCxcbiAgQk5hdmlnYXRpb25Db250cm9sLFxuICBCT3ZlcnZpZXdNYXBDb250cm9sLFxuICBCU2NhbGVDb250cm9sLFxuICBCTWFwVHlwZUNvbnRyb2wsXG4gIEJHZW9sb2NhdGlvbkNvbnRyb2wsXG4gIEJQYW5vcmFtYUNvbnRyb2xDb250cm9sLFxuICBDb250cm9sVHlwZSxcbiAgQ29udHJvbEFuY2hvcixcbiAgR2VvbG9jYXRpb25Db250cm9sT3B0aW9ucyxcbiAgTGVuZ3RoVW5pdCxcbiAgTmF2aWdhdGlvbkNvbnRyb2xPcHRpb25zLFxuICBOYXZpZ2F0aW9uQ29udHJvbFR5cGUsXG4gIE92ZXJ2aWV3TWFwQ29udHJvbE9wdGlvbnMsXG4gIFNjYWxlQ29udHJvbE9wdGlvbnMsXG4gIE1hcFR5cGVDb250cm9sT3B0aW9ucyxcbiAgTWFwVHlwZUNvbnRyb2xUeXBlXG59IGZyb20gJy4vdHlwZXMvQ29udHJvbCdcbmV4cG9ydCB7IEJJbmZvV2luZG93Q29uc3RydWN0b3IsIEJJbmZvV2luZG93T3B0aW9ucywgQkluZm9XaW5kb3cgfSBmcm9tICcuL3R5cGVzL0luZm9XaW5kb3cnXG5leHBvcnQgeyBBbmltYXRpb24gfSBmcm9tICcuL3R5cGVzL0FuaW1hdGlvbidcblxuZGVjbGFyZSBnbG9iYWwge1xuICBpbnRlcmZhY2UgV2luZG93IHtcbiAgICBfc2NyaXB0TG9hZFN0YXRlOiB7IFt1cmw6IHN0cmluZ106IExPQURJTkdfU1RBVEUgfVxuICAgIF9sb2FkaW5nQ2FsbGJhY2tzOiB7IFt1cmw6IHN0cmluZ106IEFycmF5PCgpID0+IHZvaWQ+IH1cbiAgICBCTWFwOiBCTWFwXG4gICAgQk1hcExpYjogQk1hcExpYlxuICAgIGJhaWR1bWFwaW5pdDogKCkgPT4gdm9pZFxuICAgIEJNQVBfUEVSU1BFQ1RJVkVfTUFQOiBhbnlcbiAgfVxufVxuIl0sIm5hbWVzIjpbIkluamVjdGFibGUiLCJJbmplY3QiLCJFdmVudEVtaXR0ZXIiLCJEaXJlY3RpdmUiLCJJbnB1dCIsIk91dHB1dCIsIkNvbXBvbmVudCIsIlZpZXdDaGlsZCIsIk5nTW9kdWxlIl0sIm1hcHBpbmdzIjoiOzs7Ozs7Ozs7Ozs7OztBQUFBLG9CQUF1QixHQUFRO1FBQzdCLE9BQU8sR0FBRyxLQUFLLElBQUksSUFBSSxHQUFHLEtBQUssU0FBUyxDQUFBO0tBQ3pDOzs7OztBQUVELHlCQUE0QixHQUFRO1FBQ2xDLE9BQU8sR0FBRyxLQUFLLFNBQVMsQ0FBQTtLQUN6Qjs7Ozs7QUFFRCx1QkFBMEIsR0FBUTtRQUNoQyxPQUFPLE1BQU0sQ0FBQyxTQUFTLENBQUMsUUFBUSxDQUFDLElBQUksQ0FBQyxHQUFHLENBQUMsS0FBSyxrQkFBa0IsQ0FBQTtLQUNsRTs7Ozs7QUFFRCx3QkFBMkIsR0FBUTtRQUNqQyxPQUFPLE1BQU0sQ0FBQyxTQUFTLENBQUMsUUFBUSxDQUFDLElBQUksQ0FBQyxHQUFHLENBQUMsS0FBSyxtQkFBbUIsQ0FBQTtLQUNu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