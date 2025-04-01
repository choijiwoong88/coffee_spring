//최근 본 상품 출력
function loadRecentItems(){
    const recentProducts = JSON.parse(localStorage.getItem("recentProducts")) || [];
    const container = document.getElementById("recent-products-container");
    const quickContainer = document.getElementById("quick-recent-products");

const promises = [];
    const results = [];

    console.log("loadRecentItems 호출됨");
    console.log("최근 본 상품 데이터:", recentProducts);

    // 모든 상품에 대해 유효성 검사 요청
    recentProducts.forEach((product, index) => {
        const promise = $.ajax({
            url: `/item/${product.productId}/exists`,
            type: "GET",
            dataType: "json"
        })
            .then(isValid => {
                results[index] = isValid ? product : null; // 결과를 원래 순서에 맞게 저장
            })
            .catch(() => {
                console.error(`상품 검증 실패: ${product.productId}`);
                results[index] = null; // 실패한 경우 null로 처리
            });
        promises.push(promise);
    });

    // 모든 요청 완료 후 UI 업데이트
    Promise.all(promises).then(() => {
        const validProducts = results.filter(product => product !== null); // 유효한 상품만 필터링
        localStorage.setItem("recentProducts", JSON.stringify(validProducts)); // 로컬 스토리지 갱신
    // 마이페이지의 최근 본 상품 목록
    if (container) {
        container.innerHTML = "";
        validProducts.forEach(product => {
            const productHtml = `
                <li class="product-item">
                    <a href="/item/${product.productId}">
                        <img src="${product.productImage}" alt="상품 이미지">
                    </a>
                </li>
            `;
            console.log("생성된 HTML:", productHtml);
            container.innerHTML += productHtml;
        });
    }

    // 퀵메뉴의 최근 본 상품 목록
    if (quickContainer) {
        quickContainer.innerHTML = "";
        validProducts.forEach(product => {
            const productHtml = `
                <li>
                    <a href="/item/${product.productId}">
                        <img src="${product.productImage}" alt="상품 이미지">
                    </a>
                </li>
            `;
            quickContainer.innerHTML += productHtml;
        });
    }

    });
}

//해당 페이지에서 최근본 상품 저장
function saveCookieView(productId, productImage) {
    console.log("saveCookieView 호출됨:", productId, productImage);

    let recentProducts = JSON.parse(localStorage.getItem("recentProducts")) || [];

    //기존에 있는 상품 제거
    recentProducts = recentProducts.filter(item => item.productId !== productId);
    console.log(JSON.parse(localStorage.getItem("recentProducts")));
    //새로운 상품
    recentProducts.unshift({ productId: productId, productImage: productImage });
    console.log(JSON.parse(localStorage.getItem("recentProducts")));
    console.log("추가 후 데이터:", recentProducts);
    // 최대 8개까지만 유지
    if (recentProducts.length > 8) {
//        recentProducts.pop();
        recentProducts = recentProducts.slice(0, 8); // 최근 8개 항목만 유지
    }
    localStorage.setItem("recentProducts", JSON.stringify(recentProducts));
    console.log("저장된 데이터:", localStorage.getItem("recentProducts"));

    loadRecentItems(); // 로컬 스토리지 갱신 후 UI 업데이트
}

