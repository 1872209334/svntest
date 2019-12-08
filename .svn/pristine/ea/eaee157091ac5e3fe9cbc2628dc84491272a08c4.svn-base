/**
 * @fileoverview added by tsickle
 * @suppress {checkTypes} checked by tsc
 */
import { Directive, EventEmitter, Input, Output } from '@angular/core';
import { MapService } from '../providers/mapService';
var TrafficLayerComponent = /** @class */ (function () {
    function TrafficLayerComponent(_service) {
        this._service = _service;
        this.loaded = new EventEmitter();
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
        { type: Directive, args: [{
                    selector: 'trafficlayer'
                },] },
    ];
    /** @nocollapse */
    TrafficLayerComponent.ctorParameters = function () { return [
        { type: MapService, },
    ]; };
    TrafficLayerComponent.propDecorators = {
        "options": [{ type: Input },],
        "loaded": [{ type: Output },],
    };
    return TrafficLayerComponent;
}());
export { TrafficLayerComponent };
function TrafficLayerComponent_tsickle_Closure_declarations() {
    /** @type {!Array<{type: !Function, args: (undefined|!Array<?>)}>} */
    TrafficLayerComponent.decorators;
    /**
     * @nocollapse
     * @type {function(): !Array<(null|{type: ?, decorators: (undefined|!Array<{type: !Function, args: (undefined|!Array<?>)}>)})>}
     */
    TrafficLayerComponent.ctorParameters;
    /** @type {!Object<string,!Array<{type: !Function, args: (undefined|!Array<?>)}>>} */
    TrafficLayerComponent.propDecorators;
    /** @type {?} */
    TrafficLayerComponent.prototype.options;
    /** @type {?} */
    TrafficLayerComponent.prototype.loaded;
    /** @type {?} */
    TrafficLayerComponent.prototype.trafficlayer;
    /** @type {?} */
    TrafficLayerComponent.prototype._service;
}

//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoidHJhZmZpY2xheWVyLmNvbXBvbmVudC5qcyIsInNvdXJjZVJvb3QiOiJuZzovL2FuZ3VsYXIyLWJhaWR1LW1hcC8iLCJzb3VyY2VzIjpbImNvbXBvbmVudHMvdHJhZmZpY2xheWVyLmNvbXBvbmVudC50cyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7O0FBQUEsT0FBTyxFQUFFLFNBQVMsRUFBRSxZQUFZLEVBQUUsS0FBSyxFQUFxQixNQUFNLEVBQUUsTUFBTSxlQUFlLENBQUE7QUFFekYsT0FBTyxFQUFFLFVBQVUsRUFBRSxNQUFNLHlCQUF5QixDQUFBOztJQWVsRCwrQkFBb0IsUUFBb0I7UUFBcEIsYUFBUSxHQUFSLFFBQVEsQ0FBWTtzQkFKdkIsSUFBSSxZQUFZLEVBQUU7S0FJUzs7OztJQUVyQyx3Q0FBUTs7Ozs7UUFDYixJQUFJLENBQUMsUUFBUTthQUNWLFlBQVksQ0FBQztZQUNaLEtBQUksQ0FBQyxZQUFZLEdBQUcsSUFBSSxNQUFNLENBQUMsSUFBSSxDQUFDLFlBQVksQ0FBQyxLQUFJLENBQUMsT0FBTyxDQUFDLENBQUE7WUFDOUQsTUFBTSxDQUFDLEtBQUksQ0FBQyxZQUFZLENBQUE7U0FDekIsQ0FBQzthQUNELElBQUksQ0FBQztZQUNKLEtBQUksQ0FBQyxNQUFNLENBQUMsSUFBSSxDQUFDLEtBQUksQ0FBQyxZQUFZLENBQUMsQ0FBQTtTQUNwQyxDQUFDLENBQUE7Ozs7O0lBR0MsMkNBQVc7Ozs7UUFDaEIsSUFBSSxDQUFDLFFBQVEsQ0FBQyxlQUFlLENBQUMsSUFBSSxDQUFDLFlBQVksQ0FBQyxDQUFBOzs7Z0JBMUJuRCxTQUFTLFNBQUM7b0JBQ1QsUUFBUSxFQUFFLGNBQWM7aUJBQ3pCOzs7O2dCQUxRLFVBQVU7Ozs0QkFPaEIsS0FBSzsyQkFHTCxNQUFNOztnQ0FaVDs7U0FRYSxxQkFBcUIiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBEaXJlY3RpdmUsIEV2ZW50RW1pdHRlciwgSW5wdXQsIE9uRGVzdHJveSwgT25Jbml0LCBPdXRwdXQgfSBmcm9tICdAYW5ndWxhci9jb3JlJ1xuXG5pbXBvcnQgeyBNYXBTZXJ2aWNlIH0gZnJvbSAnLi4vcHJvdmlkZXJzL21hcFNlcnZpY2UnXG5pbXBvcnQgeyBCVHJhZmZpY0xheWVyLCBUcmFmZmljTGF5ZXJPcHRpb25zIH0gZnJvbSAnLi4vdHlwZXMvVHJhZmZpY0xheWVyJ1xuXG5ARGlyZWN0aXZlKHtcbiAgc2VsZWN0b3I6ICd0cmFmZmljbGF5ZXInXG59KVxuZXhwb3J0IGNsYXNzIFRyYWZmaWNMYXllckNvbXBvbmVudCBpbXBsZW1lbnRzIE9uSW5pdCwgT25EZXN0cm95IHtcbiAgQElucHV0KClcbiAgcHJpdmF0ZSBvcHRpb25zOiBUcmFmZmljTGF5ZXJPcHRpb25zXG5cbiAgQE91dHB1dCgpXG4gIHByaXZhdGUgbG9hZGVkID0gbmV3IEV2ZW50RW1pdHRlcigpXG5cbiAgcHJpdmF0ZSB0cmFmZmljbGF5ZXI6IEJUcmFmZmljTGF5ZXJcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIF9zZXJ2aWNlOiBNYXBTZXJ2aWNlKSB7fVxuXG4gIHB1YmxpYyBuZ09uSW5pdCgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlXG4gICAgICAuYWRkVGlsZUxheWVyKCgpID0+IHtcbiAgICAgICAgdGhpcy50cmFmZmljbGF5ZXIgPSBuZXcgd2luZG93LkJNYXAuVHJhZmZpY0xheWVyKHRoaXMub3B0aW9ucylcbiAgICAgICAgcmV0dXJuIHRoaXMudHJhZmZpY2xheWVyXG4gICAgICB9KVxuICAgICAgLnRoZW4oKCkgPT4ge1xuICAgICAgICB0aGlzLmxvYWRlZC5lbWl0KHRoaXMudHJhZmZpY2xheWVyKVxuICAgICAgfSlcbiAgfVxuXG4gIHB1YmxpYyBuZ09uRGVzdHJveSgpIHtcbiAgICB0aGlzLl9zZXJ2aWNlLnJlbW92ZVRpbGVMYXllcih0aGlzLnRyYWZmaWNsYXllcilcbiAgfVxufVxuIl19